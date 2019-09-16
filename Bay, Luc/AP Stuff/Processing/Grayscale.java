package Processing;

import processing.core.PApplet;
import processing.core.PImage;
import processing.video.*;

public class Grayscale extends PApplet
{
    private Capture cam;
    
    private boolean newEditedFrameAvailable;
    private PImage editedFrame;
    
    public static void main(String[] args)
    {
        PApplet.main("Processing.Grayscale");
    }
    
    public void settings()
    {
        size(1280, 720);
    }
    
    public void setup()
    {
        String[] cameras = Capture.list();
        
        System.out.println("Available cameras:");
        for(String camera : cameras)
            System.out.println(camera);
        
        cam = new Capture(this, cameras[0]);
        cam.start();
    }
    
    public void draw()
    {
        if(newEditedFrameAvailable)
        {
            image(editedFrame, 0, 0);
            newEditedFrameAvailable = false;
        }
            
        if(cam.available() && ! newEditedFrameAvailable)
            readAndEditFrameNegative();
    }
    
    // precondition: cam.available() && background != null
    private void readAndEditFrameGreen()
    {
        cam.read();
        
        editedFrame = createImage(width, height, RGB);
        editedFrame.loadPixels();
        cam.loadPixels();
        
        for(int i = 0; i < editedFrame.pixels.length; i++)
        {
            int pixel = cam.pixels[i];
         
            if(green(pixel) > 50 && blue(pixel) < 100 && red(pixel) < 100)
            	editedFrame.pixels[i] = color(255, 255, 255);
            
            /*else
            {
            	average = (red(pixel) + green(pixel) + blue(pixel)) / 3;
            	editedFrame.pixels[i] = color(average, average, average);
            }*/
            
        }
        
        editedFrame.updatePixels();
        
        newEditedFrameAvailable = true;
        
    }
    private void readAndEditFrameNegative()
    {
        cam.read();
        
        editedFrame = createImage(width, height, RGB);
        editedFrame.loadPixels();
        cam.loadPixels();
        int next = 0;
        
        for(int i = 0; i < editedFrame.pixels.length; i++)
        {
            int pixel = cam.pixels[i];
            if((green(pixel) > 50 && blue(pixel) < 100 && red(pixel) < 100) || next > 0)
            {
            	//editedFrame.pixels[i] = color(255-red(pixel), 255-green(pixel), 255-blue(pixel));
            	next = 0;
            }
            else
            	editedFrame.pixels[i] = color(50+red(pixel), 50+green(pixel), 50+blue(pixel));
            next--;
//            	else
//            	
        }
        
        editedFrame.updatePixels();
        
        newEditedFrameAvailable = true;
        
    }
}