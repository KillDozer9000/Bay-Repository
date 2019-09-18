package trafficlight;

import processing.core.PApplet;

public class Light 
{
	int y = 0;
	int x = 250 / 2;
	int rad = 150;
	boolean top = false;
	boolean middle = false;
	boolean bottom = false;
	private PApplet parent;

	public Light(PApplet p, int xt)
	{
		parent = p;
		x = xt;
	}

	public void draweverything() 
	{
		drawtop();
		drawmiddle();
		drawbottom();
	}

	public void green() 
	{
		parent.fill(0, 200, 0);
		parent.ellipse(x, y, rad, rad);
	}

	public void red() 
	{
		parent.fill(200, 0, 0);
		parent.ellipse(x, y, rad, rad);
	}

	public void yellow() 
	{
		parent.fill(200, 200, 0);
		parent.ellipse(x, y, rad, rad);
	}

	public void off() 
	{
		parent.fill(50, 50, 50);
		parent.ellipse(x, y, rad, rad);
	}

	public void drawtop() 
	{
		y = 100;
		if (top)
			red();
		else
			off();
	}

	public void drawbottom() 
	{
		y = 440;
		if (bottom)
			green();
		else
			off();
	}

	public void drawmiddle() 
	{
		y = 270;
		if (middle)
			yellow();
		else
			off();

	}

	public void changenext() 
	{
		if (top) 
		{
			top = false;
			bottom = true;
		} 
		else if (middle) 
		{
			middle = false;
			top = true;
		} 
		else if (bottom) 
		{
			bottom = false;
			middle = true;
		} 
		else 
		{
			top = true;
		}
	}

	public boolean getgreen() 
	{
		return bottom;
	}
	public boolean getyellow() 
	{
		return middle;
	}
	public boolean getred() 
	{
		return top;
	}
	public void makegreen()
	{
		bottom = true;
		middle = false;
		top = false;
	}
	public void makeyellow()
	{
		bottom = false;
		middle = true;
		top = false;
	}
	public void makered()
	{
		bottom = false;
		middle = false;
		top = true;
	}
}
