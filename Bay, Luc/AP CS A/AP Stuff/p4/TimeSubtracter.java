package p4;

import java.util.Scanner;

public class TimeSubtracter 
{
	
	static Scanner fromKeyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{	
		System.out.print("Enter the first time: ");
		String first = fromKeyboard.nextLine();
		
		System.out.print("Enter the second time: ");
		String second = fromKeyboard.nextLine();

				
		int firstmin = (int)Double.parseDouble(first.substring(2, 4));
		int secondmin = (int)Double.parseDouble(second.substring(2, 4));
		
		firstmin += Double.parseDouble(first.substring(0, 2))*60;
		secondmin += Double.parseDouble(second.substring(0, 2))*60;
		
		int dif = secondmin - firstmin;
		
		if(dif<0)
			dif = 1440-(dif*-1);
		
		int hrdif = (int)dif/60;
		int mindif = dif%60;

			
		System.out.println("\n"+hrdif+" Hours and " + mindif+" minutes");
	}
}
