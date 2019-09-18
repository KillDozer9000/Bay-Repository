package BallCloud;

import processing.core.PApplet;

public class BallRunner extends PApplet
{
	int bnum = 200;
	int maxspd = 10;
	int maxsize = 40;
	int minsize = 20;
	private Ball[] balls = new Ball[bnum];
	
	public static void main (String[] args)
	{
		PApplet.main("BallCloud.BallRunner");
	}
	
	public void settings()
	{
		size(1900, 1000);
	}
	
	public void setup()
	{
		//balls[1] = new Ball(this, 250, 250, 10, 10, 200, 200, 200, 40);
		for(int i = 0; i<bnum; i++)
		{
			int xspd = (int)random(1, maxspd);
			int yspd = (int)random(1, maxspd);
			//int yspd = 5;
			//int xspd = 5;
			int size = (int)random(minsize, maxsize);
			int x = (int)random(size+10, 1900-size-10);
			int y = (int)random(size+10, 1000-size-10);
			//int x = 40;
			//int y = 40;
			int r = (int)random(0, 255);
			int g = (int)random(0, 254);
			int b = (int)random(0, 255);
//			int r = 255;
//			int g = 254;
//			int b = 255;
			balls[i] = new Ball(this, x, y, xspd, yspd, r, g, b, size);
		}
	}
	
	public void draw()
	{
		background(0);
		noStroke();

		for(int i = 1; i<bnum; i++)
		{
			balls[i].updatepos();

//			if(balls[i].getgreen() < 255)
//			{
				for(int n = 0; n < bnum; n++)
				{
					if(balls[i].collision(balls[n]))
						balls[i].keepcolor(balls[n]);
				}
//			}
			balls[i].drawball();
		}
	}
}
