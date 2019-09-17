package p2;

import java.awt.Color;

public class P2_5 
{
	public static void main(String[] args)
	{
		Color c1 = new Color(50,100,150);
		System.out.println(c1);
		Color c2 = c1.brighter();
		System.out.println(c2);
	}
}