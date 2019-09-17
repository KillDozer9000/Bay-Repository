package p4;

import java.util.Scanner;

public class TimeSubtracter2 
{
	static Scanner fromKeyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int min = 0;
		int hr = 0;
		int dif = 0;
		int sixcount = 0;
		System.out.print("Enter the first time: ");
		int first = fromKeyboard.nextInt();
		
		System.out.print("Enter the second time: ");
		int second = fromKeyboard.nextInt();
		
		for(dif=first; dif < second; dif++)
		{
			if(dif%60 == 0 && dif!=0)
			{
				sixcount++;
				System.out.println("Spotted: "+dif);
			}
			System.out.println(dif);
		}
		System.out.println("\nDif: "+dif);
		
		hr = sixcount-1;
		min = (dif-(hr*40))-(hr*60);

		
		
		System.out.println("\nHours: "+(sixcount-1));
		System.out.println("Minutes: "+min);
		
	}
	
}
