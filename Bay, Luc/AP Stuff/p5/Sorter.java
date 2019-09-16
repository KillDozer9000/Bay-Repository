package p5;

import java.util.Scanner;

public class Sorter 
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double b, m ,s = 0;
		System.out.println("Please enter three number: ");
		double n1 = fromKeyboard.nextDouble();
		double n2 = fromKeyboard.nextDouble();
		double n3 = fromKeyboard.nextDouble();
		
		
		if(n1 > n2)
			b = n1;
		else
			b = n2;
		if(n3 > b)
			b = n3;
		
		if(n1 < n2)
			s = n1;
		else
			s = n2;
		if(n3 < s)
			s = n3;
		
		if(n1 != b && n1 != s)
			m = n1;
		else if(n2 != b && n2 != s)
			m = n2;
		else
			m = n3;
		
		System.out.println("\n"+b);
		System.out.println(m);
		System.out.println(s);
	}
}
