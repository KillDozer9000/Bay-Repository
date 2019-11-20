package p21;

import java.awt.Color;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class colorSet 
{
	static Set<Color> set1 = new HashSet<Color>();
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
        System.out.print("Enter red value: ");
		Float r = (float) in.nextDouble();
		
        System.out.print("Enter green value: ");
		Float g = (float) in.nextDouble();
		
        System.out.print("Enter blue value: ");
		Float b = (float) in.nextDouble();

		add();
		
		int size1 = set1.size();
		set1.add(new Color(r, g, b));
		
		if(size1 == set1.size())
			System.out.println("Contains color");
		else
			System.out.println("Does not contain color");
	}
	
	public static void add()
	{
		set1.add(Color.BLACK);
		set1.add(Color.BLUE);
		set1.add(Color.CYAN);
		set1.add(Color.DARK_GRAY);
		set1.add(Color.GRAY);
		set1.add(Color.GREEN);
		set1.add(Color.LIGHT_GRAY);
		set1.add(Color.MAGENTA);
		set1.add(Color.ORANGE);
		set1.add(Color.PINK);
		set1.add(Color.RED);
		set1.add(Color.WHITE);
		set1.add(Color.YELLOW);
	}

}
