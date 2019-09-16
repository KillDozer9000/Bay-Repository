package spaceInvaders;

import processing.core.PApplet;
import processing.core.PImage;

public class Power
{
	
	private PApplet parent;
	
	int powery = 0;
	int powerx = 0;
	
	
	public Power(PApplet p)
	{
		parent = p;
	}
	public void drawpower()
	{
		parent.fill(47,251,64);
		parent.ellipse(powerx, powery, 15, 15);
	}
	public void randomize()
	{
		powerx = (int)parent.random(475);
		powery = (int)parent.random(300);
	}
	public int getpowerx()
	{
		return powerx;
	}
	public int getpowery()
	{
		return powery;
	}

}




