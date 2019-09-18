package ImageManiplulation;

import processing.core.PApplet;
import processing.core.PImage;

public class ImagePixels extends PApplet
{
    private PImage picture;
    private PImage backg;
    
    public static void main(String[] args)
    {
        PApplet.main("ImageManiplulation.ImagePixels");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
    		
        picture = loadImage("hamster.jpg");
        picture.resize(500, 500);
        backg = loadImage("explosion.png");
        greenscreen();
        //grayscale();
        //inverse();
        //mirror();
    }
    
    public void draw()
    {
        image(picture, 0, 0);
    }
    public void greenscreen()
    {
    		int sens = 210;
    		backg.resize(picture.width, picture.height);
    		picture.loadPixels();
    		for(int i = 0; i<picture.pixels.length;i++)
    		{
    			int pixel = picture.pixels[i];
    			float red = red(pixel);
    			float green = green(pixel);
    			float blue = blue(pixel);
    			System.out.println("red: "+ red);
    			if(red > sens && green > sens && blue > sens)
    				picture.pixels[i] = backg.pixels[i];
//    			float bluerat = blue/red;
//    			if(bluerat > 2)
//    				picture.pixels[i] = backg.pixels[i];
    		}
    		
    		picture.updatePixels();
    }
    public void inverse()
    {
        picture.loadPixels();
        
        for(int i = 0; i < picture.pixels.length; i++)
        {
            int pixel = picture.pixels[i];
            picture.pixels[i] = color(red(-pixel), green(-pixel), blue(-pixel));
        }
        
        picture.updatePixels();
    }
    
    public void mirror()
    {
    		//image(picture, 0,0);
    		//copy(width/2, 0, width/2, 0, 0, 0, width/2, height);
    		//image(otherhalf, width/2, 0);
        picture.loadPixels();
        
        for(int row = 0; row < picture.height; row++)
        {
        		for(int col = 0; col < picture.width/2; col++)
        		{
        			int i = (row*picture.width) + col;
        			int newCol = picture.width - (col+1);
       			int j = (row*picture.width) + newCol;
        			picture.pixels[i] = picture.pixels[j];
        		}
        }
        
        picture.updatePixels();
    		
    }
    public void grayscale()
    {
        picture.loadPixels();
        
        for(int i = 0; i < picture.pixels.length; i++)
        {
            int pixel = picture.pixels[i];
            int average = ((int)(red(pixel) + green(pixel) + blue(pixel)))/3;
            System.out.println("Average: " + average);
            picture.pixels[i] = color(average, average, average);
        }
        
        picture.updatePixels();
    }
    
    public void test()
    {
        picture.loadPixels();
        int distort = 10;
        for(int i = 0; i < picture.pixels.length; i++)
        {
            int pixel = picture.pixels[i];
            picture.pixels[i] = color(red(pixel+distort), green(pixel+distort), blue(pixel+distort));
        }
        
        picture.updatePixels();
    }
}
