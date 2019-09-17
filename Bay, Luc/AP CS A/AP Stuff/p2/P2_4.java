package p2;

import java.awt.Rectangle;

public class P2_4 
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(100, 150);
		Rectangle r2 = new Rectangle(50, 50, 150, 100);
		System.out.println("Rectangle 1: "+r1);
		System.out.println("Rectangle 2: "+r2);
		
		Rectangle intersection = r1.intersection(r2);
		System.out.println("Intersection: "+intersection);
		//If the width and/or height of the "intersection" rectangle is negative,
		//the rectangles don't intersect
	}
}
