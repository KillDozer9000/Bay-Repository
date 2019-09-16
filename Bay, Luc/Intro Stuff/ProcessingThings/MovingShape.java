package ProcessingThings;

import java.util.Scanner;

import processing.core.PApplet;


public class MovingShape extends PApplet
{
	
	int xwind = 1000;
	int ywind = 900;
	
	int width = 50;
	
	int x = 0;
	int y = 0;
	
	int xspeed = 1;
	int yspeed = 1;
	
	int xdirect = 10;
	int ydirect = 10;
	
	int r1 = 50;
	int g1 = 50;
	int b1 = 50;
	
	int r2 = 100;
	int g2 = 100;
	int b2 = 100;
	
	float color = 0;
	int background = 0;
	
	
    public static void main(String[] args)
    {
        PApplet.main("ProcessingThings.MovingShape");
    }
    
    public void settings()
    {
    		size(xwind, ywind);
		x = xwind / 2;
		y = ywind / 2;
    }
    
	public void draw()
	{
		noStroke();
		background(background);
		movecircle();
	}
	
	public void setup()
	{
		frameRate(60);
	}
	
	public void circle()
	{

		r1 = (int) (Math.random() * 255);
		g1 = (int) (Math.random() * 255);
		b1 = (int) (Math.random() * 255);
		
		r2 = (int) (Math.random() * 255);
		g2 = (int) (Math.random() * 255);
		b2 = (int) (Math.random() * 255);
		
		fill(r1, g1, b1);
		ellipse(x, y, width*2, width*2);
		fill(r2, g2, b2);
		ellipse(x, y, width, width);
	}
	
	public void movecircle()
	{	
		x = x + (xspeed * xdirect);
		y = y + (yspeed * ydirect);
		
		if(x > xwind - width || x < width)//if ball hits left/right
		{
			if(x > 250)
				x-= 30;
			else
				x+= 30;
			
			width++;
			xdirect *= -1;
		}
			
		if(y > ywind - width || y < width)//if ball hits top/bottom
		{
			if(y > 250)
				y-= 30;
			else
				y+= 30;
			
			width++;
			ydirect *= -1;
		}
			
		circle();//change this to draw ship
		
		color = blue(get(mouseX, mouseY));
		//print(color);
		
		if(color != 0)//Speeds the ball up when moused over
		{
			xspeed = xspeed + 1;
			yspeed = yspeed + 1;
		}
	}
}

