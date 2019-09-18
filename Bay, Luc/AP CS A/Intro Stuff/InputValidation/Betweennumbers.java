package InputValidation;

import java.util.Scanner;

public class Betweennumbers
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		double input = 200;
		while(input <= 1 || input >= 5)
		{
			System.out.print("put a number between 1 and 5: \n");
			input = fromKeyboard.nextDouble();
			if(input >= 1 && input <= 5)
			{
				System.out.print("valid input \n");
				break;
			}
			else
				System.out.print("not valid input \n");
		}
	}
}
