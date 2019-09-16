package SOWJCode;

import java.util.Scanner;

public class Chp5Pc4 
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{	
		int pennies = 1;
		int total = 0;
		int count = 1;
		System.out.print("How many days worked?: \n");
		int day = fromKeyboard.nextInt();
		if(day >= 1)
		{
			System.out.print("Day | Pay \n");
			for(;count<=day;count++,pennies*=2)
			{
			System.out.print(count+"     ");
			total = total+pennies;
			System.out.print(total+"cents\n");
			}
		}
		else
			System.out.print("not valid \n");
	}
}
