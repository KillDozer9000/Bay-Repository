package ProcessingThings;

import java.util.Scanner;

import processing.core.PApplet;

public class Collision extends PApplet
{
	
	int xwind = 500;
	int ywind = 600;
	
	int charx = xwind/2;
	int chary = ywind/2;
	
	int charrad = 25;
	int enemrad = 25;
	
	int enemx = xwind/2;
	int enemy = ywind/2;
	
	public void draw()
	{
		background(0);
		collision();
	}
	
	public void setup()
	{
		size(xwind, ywind);
	}
	
	public void enemy()
	{
		fill(152, 255, 152);
		ellipse(enemx,enemy, enemrad*2, enemrad*2);
	}
	
	public void character()
	{		
		fill(139, 0, 139);
		ellipse(mouseX, mouseY, charrad*2, charrad*2);
	}
	
	public void collision()
	{
		character();
		if(enemx-enemrad < mouseX+charrad && mouseX-charrad < enemx+enemrad)
		{
			if(enemy-enemrad < mouseY+charrad && mouseY-charrad < enemy+enemrad)
				System.out.print("Hit \n");
			
			else
				enemy();
		}
		
		else
			enemy();
		
	}
}
