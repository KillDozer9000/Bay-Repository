package spaceInvaders;

import processing.core.PApplet;

public class Projectile
{
	private PApplet parent;
	int speed = 7;
	int x = 0;
	int y = 0;
	
	public Projectile(PApplet p, int shipx, int shipy)
	{
		parent = p;
		x = shipx;
		y = shipy;
	}
	public void drawpr()
	{
		parent.fill(255,255,255);
		parent.rect(x, y, 4, 10);	
	}
	public void updatepr()
	{
		if(y>-10)
		{
			y -= speed;
			//speed += 1;
		}
	}
	public int getprojx()
	{
		return x;
	}
	public int getprojy()
	{
		return y;
	}
}
