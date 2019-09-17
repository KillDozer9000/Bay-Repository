package p6;

import java.util.Scanner;

public class PrimeFinderRunner 
{
	static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int num = k.nextInt();
		
		PrimeFinder p1 = new PrimeFinder(num);
		System.out.println("\nPrimes: "+p1.getPrimes());
	}
}
