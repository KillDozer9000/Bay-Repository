package spaceInvaders;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy
{
	private PApplet parent;
	PImage enemy;
	int startx = 0;
	int x = 0;
	int y = 50;
	int xspeed = 3;
	int yspeed = 45;
	//int xchange = 0;
	//int xbuf = 30;
	

	public Enemy(PApplet p, int starx)
	{
		startx = starx;
		x += startx;
		parent = p;
		enemy = parent.loadImage("images/newenemy1.png");
	}
	public void drawenemy()
	{
		parent.fill(50, 50, 255);
		parent.image(enemy, x, y, 50, 50);
	}

	public void moveenemy()
	{
		x += xspeed;
		if(x >= parent.width-(25)-5 || x <= (25)+5)
		{
			xspeed *= -1;
			y += yspeed;
		}
	}
	public boolean lose() 
	{
		if(y > 325)
			return true;
		else
			return false;
	}
	public int getenemx()
	{
		return x;
	}
	public int getenemy()
	{
		return y;
	}
	
}
