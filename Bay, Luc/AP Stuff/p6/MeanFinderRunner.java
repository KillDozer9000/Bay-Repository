package p6;

import java.util.Scanner;

public class MeanFinderRunner 
{
	static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		MeanFinder m1 = new MeanFinder();
		double val = 0;
		
		System.out.println("Enter values, 'end' to end");
		String strval = k.nextLine();
		
		while(!(strval.equals("end")))
		{
			val = Double.parseDouble(strval);
			m1.addVal(val);
			strval = k.nextLine();
		}
		
		System.out.println("\n"+m1);
		System.out.println("Size: "+m1.getSize());
		System.out.println("Average: "+m1.getAverage());
		System.out.println("Standard Deviation: "+m1.getSD());
	}

}
