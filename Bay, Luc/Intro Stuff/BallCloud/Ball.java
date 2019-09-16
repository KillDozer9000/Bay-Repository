package BallCloud;

import processing.core.PApplet;

public class Ball 
{
	private PApplet parent;
	private float xc, yc;
	private int xspeed, yspeed;
	private int r, g, b;
	private int size;
	
	public Ball(PApplet p, float x, float y, int xspd, int yspd, int re, int gr, int bl, int sz)
	{
		parent = p;
		xc = x;
		yc = y;
		xspeed = xspd;
		yspeed = yspd;
		r = re;
		g = gr;
		b = bl;
		size = sz;
	}
	
	public void drawball()
	{
		parent.fill(r, g, b);
		parent.ellipse(xc, yc, size, size);
	}

	 public void updatepos()
	 {
		xc+= xspeed;
		yc+= yspeed;
		
		if(xc >= parent.width-(size/2)-5 || xc <= (size/2)+5)
			xspeed *= -1;
		if(yc >= parent.height-(size/2)-5 || yc <= (size/2)+5)
			yspeed *= -1;
		
	 }
	 
	 public boolean collision(Ball otherball)
	 {
		 if(PApplet.dist(xc, yc, otherball.xc, otherball.yc) < otherball.size/2 + size/2)
			 return true;
		 return false;
	 }
	 
	 public void turnGreen()
	 {
		r = 0;
		g = 255;
		b = 0;
	 }
	 public int getgreen()
	 {
		 return g;
	 }
	 public void keepcolor(Ball otherball)
	 {
		 if(otherball.size <= size)
		 {
			 otherball.r = r;
			 otherball.g = g;
			 otherball.b = b;
		 }
		 else
		 {
			 r = otherball.r;
			 g = otherball.g;
			 b = otherball.b;
		 }
	 }
	 public void grow(Ball otherball)
	 {
		 if(otherball.size < size)
		 {
			if(xc < size/2)
				xc = size/2+50;
			if(xc > parent.width - size/2)
				xc = parent.width - size/2 - 50;
			if(yc < size/2)
				yc = size/2+50;
			if(yc > parent.height - size/2)
				yc = parent.height - size/2 - 50;
			 size += otherball.size;
			 otherball.size = 0;
		 }
	 }
}
