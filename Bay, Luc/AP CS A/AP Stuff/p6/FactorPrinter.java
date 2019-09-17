package p6;

import java.util.Scanner;

public class FactorPrinter 
{
	static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int num = k.nextInt();
		
		FactorGenerator f1 = new FactorGenerator(num);
		System.out.println("\nFactors: "+f1.getFactors());
	}
}
