package SecretImage;

import processing.core.PApplet;
import processing.core.PImage;

public class secretimage extends PApplet
{
	private PImage secret; 
	
	public static void main (String[] args)
	{
		PApplet.main("SecretImage.secretimage");
	}
	public void settings()
	{
		size(500, 666);
	}
	public void setup()
	{
		secret = loadImage("images/secretfire.png");
		decoder();
	}
	
	public void draw()
	{
		image(secret, 0,0);
	}
	public void decoder()
	{
		secret.loadPixels();
		for(int i = 0; i< secret.pixels.length; i++)
		{
			int pixel = secret.pixels[i];
			float red = red(pixel);
			if(red%2 == 0)
				secret.pixels[i] = color(255);
			else
				secret.pixels[i] = color(0);
		}
		secret.updatePixels();
	}
}