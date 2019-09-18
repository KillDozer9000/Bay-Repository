package spaceInvaders;

import processing.core.PApplet;
import processing.core.PImage;

public class Barrier
{
	private PApplet parent;
	int x = 50;
	int y= 50;
	int xchange = 0;
	PImage barrier;
	
	public Barrier(PApplet p, int xchange)
	{
		parent = p;
		x = xchange;
		barrier = parent.loadImage("images/newbarrier.png");
	}
	public void drawbar()
	{
		parent.image(barrier, x,400, 75, 50);
		//parent.background(0,0,0);
	}
	public void makewall(int barnum)
	{
		xchange = 500/(barnum+1);

		for(int i = 1; i <= barnum; i++)
		{
			xchange*=i;
		}
	}
	public int getbarx()
	{
		return x;
	}
	public int getbary()
	{
		return y;
	}
}
