package p4;

import java.util.Scanner;

public class PairRunner 
{
	static Scanner fromKeyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter the first number: ");
		double n1 = fromKeyboard.nextDouble();
		
		System.out.print("Enter the second number: ");
		double n2 = fromKeyboard.nextDouble();
		
		Pair p = new Pair(n1,n2);
		
		System.out.println("Sum: "+p.sum());
		System.out.println("Difference: "+p.dif());
		System.out.println("Product: "+p.prod());
		System.out.println("Average: "+p.average());
		System.out.println("Distance: "+p.dist());
		System.out.println("Maximum: "+p.max());
		System.out.print("Minimum: "+p.min());
		
	}
}
