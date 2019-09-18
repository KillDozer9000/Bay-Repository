package spaceInvaders;

import processing.core.PApplet;
import processing.core.PImage;

public class Ship
{
	private PApplet parent;
	int shipx = 50;
	int shipy= 50;
	int xchange = 0;
	PImage ship;
	
	public Ship(PApplet p)
	{
		parent = p;
		ship = parent.loadImage("images/newSIship.png");
	}
	public void drawship()
	{
		shipx = parent.mouseX;
		shipy = parent.mouseY;
		if(shipy <= 440)
			shipy = 440;
		if(shipy >= 470)
			shipy = 470;
		if(shipx >= 470)
			shipx = 470;
		if(shipx <= 30)
			shipx = 30;
		parent.image(ship, shipx, shipy, 40,40);
		//parent.background(0,0,0);
	}
	public void makewall(int shipnum)
	{
		xchange = 500/(shipnum+1);

		for(int i = 1; i <= shipnum; i++)
		{
			drawship();
		}
	}
	public int getshipx()
	{
		return shipx;
	}
	public int getshipy()
	{
		return shipy;
	}

}




