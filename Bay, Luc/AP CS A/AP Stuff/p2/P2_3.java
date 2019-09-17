package p2;

import java.awt.Rectangle;

public class P2_3 
{
	public static void main(String[] args)
	{
		int width = 30;
		int height= 60;
		
		Rectangle box = new Rectangle(width, height);
		System.out.println("Top left: "+box);
		
		box.setLocation(width,0);
		System.out.println("Top right: "+box);
		
		box.setLocation(width,height);
		System.out.println("Bottom right: "+box);
		
		box.setLocation(0, height);
		System.out.println("Bottom left: "+box);
	}
}