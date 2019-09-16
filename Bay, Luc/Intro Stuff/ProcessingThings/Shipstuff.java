package ProcessingThings;

import processing.core.PApplet;

public class Shipstuff extends PApplet
{	
	float color = 0;
	int background = 0;
	
	public void draw()
	{
		background(background);
		clickShip();
	}
	public static void main (String[] args)
	{
		PApplet.main("ProcessingThings.Shipstuff");
	}
	
	public void setup()
	{

	}
	public void settings()
	{
		size(500, 500);
	}
	
	public void clickShip()
	{
		drawship();
		color = blue(get(mouseX, mouseY));
		println(color);
		if(color == background)
			drawship();	
		else
			drawshipwfire();
	}
	
	public void drawship()
	{
		noStroke();
		
		fill(222, 84, 61);//Wings
		quad(245, 200, 245, 250, 220, 300, 220, 250);
		quad(265, 200, 265, 250, 290, 300, 290, 250);
		
		fill(132, 174, 172);//Body
		arc(255, 250, 50, 225, radians(180), radians(270));
		arc(255, 250, 50, 225, radians(270), radians(360));
		arc(255, 250, 50, 50, radians(90), radians(180));
		arc(255, 250, 50, 50, radians(0), radians(90));
		
		fill(73, 104, 118);//First Windows
		ellipse(255, 180, 15, 15);
		ellipse(255, 210, 18, 18);
		ellipse(255, 240, 21, 21);
		
		fill(89, 209, 246);//Second Windows
		ellipse(255, 180, 10, 10);
		ellipse(255, 210, 13, 13);
		ellipse(255, 240, 16, 16);
		
	}
	
	public void drawshipwfire()
	{
		noStroke();

		fill(252, 159, 44);
		arc(255, 300, 40, 110, radians(0), radians(360));		
		fill(252, 220, 47);
		arc(255, 300, 30, 90, radians(0), radians(360));		
		fill(255, 244, 188);
		arc(255, 300, 20, 70, radians(0), radians(360));
		
		drawship();
	}
}
