package SecretImage;

import processing.core.PApplet;
import processing.core.PImage;

public class grayscaleimage extends PApplet
{
	private PImage secret;
	private PImage cover;
	
	public static void main (String[] args)
	{
		PApplet.main("SecretImage.grayscaleimage");
	}
	public void settings()
	{
		size(480, 405);
	}
	public void setup()
	{
		secret = loadImage("images/Kitten.png");
		cover = loadImage("images/Dog.png");
		secret.resize(cover.width,cover.height);
		encoder();
		cover.save("cover.png");
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
			
			float secretRed = red(secret.pixels[i]);
			
			if(secretRed < 224)//all even
			{
				red = makeeven(red);
				green = makeeven(green);
				blue = makeeven(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 193)//g even, b even
			{
				red = makeodd(red);
				green = makeeven(green);
				blue = makeeven(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 162)//b even
			{
				red = makeodd(red);
				green = makeodd(green);
				blue = makeeven(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 131)
			{
				red = makeodd(red);
				green = makeodd(green);
				blue = makeodd(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 100)
			{
				red = makeeven(red);
				green = makeodd(green);
				blue = makeeven(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 69)
			{
				red = makeeven(red);
				green = makeodd(green);
				blue = makeodd(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else if(secretRed < 31)
			{
				red = makeodd(red);
				green = makeeven(green);
				blue = makeodd(blue);
				cover.pixels[i] = color(red, green, blue);
			}
			else
			{
				red = makeeven(red);
				green = makeodd(green);
				blue = makeeven(blue);
				cover.pixels[i] = color(red, green, blue);
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
			float r = red(pixel);
			float g = green(pixel);
			float b = blue(pixel);
//			if((r%2) == 0 && (g%2) == 0 && (b%2) == 0)//all even
//				cover.pixels[i] = color(255);
//			else if((r%2) == 1 && (g%2) == 0 && (b%2) == 0)//g even, b even
//				cover.pixels[i] = color(224);
//			else if((r%2) == 1 && (g%2) == 1 && (b%2) == 0)//b even
//				cover.pixels[i] = color(193);
//			else if(r%2 == 1 && g%2 == 1 && b%2 == 1)//no even
//				cover.pixels[i] = color(162);
//			else if(r%2 == 0 && g%2 == 1 && b%2 == 0)//r even, b even
//				cover.pixels[i] = color(131);
//			else if(r%2 == 0 && g%2 == 1 && b%2 == 1)//r even
//				cover.pixels[i] = color(100);
//			else if(r%2 == 1 && g%2 == 0 && b%2 == 1)//g even
//				cover.pixels[i] = color(69);
//			else if(r%2 == 0 && g%2 == 0 && b%2 == 1)//r even, g even
//				cover.pixels[i] = color(31);
			if(r%2 == 0)
			{
				if(g%2 == 0)
				{
					if(b%2 == 0)//all even
						cover.pixels[i] = color(31);
					else//r even, g even
						cover.pixels[i] = color(69);
				}
				else
				{
					if(b%2 == 0)//r even, b even
						cover.pixels[i] = color(100);
					else//r even
						cover.pixels[i] = color(131);
				}
			}
			else
			{
				if(g%2 == 0)
				{
					if(b%2 == 0)//g even, b even
						cover.pixels[i] = color(162);
					else// g even
						cover.pixels[i] = color(193);
				}
				else
				{
					if(b%2 == 0)// b even
						cover.pixels[i] = color(224);
					else//none even
						cover.pixels[i] = color(255);
				}
			}
		}
		cover.updatePixels();
	}
	public float makeodd(float number)
	{
		if(number%2 == 1)//if odd, make even
		{
			if(number == 255)
				number--;
			else
				number++;
		}
		return number;
	}
	public float makeeven(float number)
	{
		if(number%2 == 1)//if odd, make even
		{
			if(number == 255)
				number--;
			else
				number++;
		}
		return number;
	}
}

