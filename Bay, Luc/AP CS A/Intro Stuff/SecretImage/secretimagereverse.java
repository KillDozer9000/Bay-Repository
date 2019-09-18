package SecretImage;

import processing.core.PApplet;
import processing.core.PImage;

public class secretimagereverse extends PApplet
{
	private PImage secret;
	private PImage cover;
	
	public static void main (String[] args)
	{
		PApplet.main("SecretImage.secretimagereverse");
	}
	public void settings()
	{
		size(1024, 683);
	}
	public void setup()
	{
		secret = loadImage("images/spacemonkey.png");
		cover = loadImage("images/normalmonkey.png");
		secret.resize(cover.width,cover.height);
		encoder();
		cover.save("images/cover.png");
		decoder();
	}
	
	public void draw()
	{
		image(cover, 0,0);
	}
	public void encoder()
	{
		cover.loadPixels();
		secret.loadPixels();
		for(int i = 0; i<secret.pixels.length; i++)
		{
			int pixel = cover.pixels[i];
			float red = red(pixel);
			float green = green(pixel);
			float blue = blue(pixel);
			if(red(secret.pixels[i]) <= (255/2))
			{
				//System.out.println("Black Red: "+(red));
				if(red%2 == 0)//if even, make odd
				{
					if(red == 255)
						red--;
					else
						red++;
				}
				cover.pixels[i] = color(red, green, blue);
				//System.out.println("Black Red: "+(red));
			}
			else
			{
				if(red%2 == 1)//if odd, make even
				{
					if(red == 255)
						red--;
					else
						red++;
				}
				cover.pixels[i] = color(red, green, blue);
				//System.out.println("White Red: "+(red));
			}
		}
		cover.updatePixels();
	}
	public void decoder()
	{
		cover.loadPixels();
		for(int i = 0; i< cover.pixels.length; i++)
		{
			int pixel = cover.pixels[i];
			float red = red(pixel);
			if(red%2 == 0)
				cover.pixels[i] = color(255);
			else
				cover.pixels[i] = color(0);
		}
		cover.updatePixels();
	}
}

