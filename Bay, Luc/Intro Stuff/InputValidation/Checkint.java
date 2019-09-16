package InputValidation;

import java.util.Scanner;

public class Checkint
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		int input = -1;
		while(input <= 0)
		{
			System.out.print("put a non-negative integer: \n");
			input = fromKeyboard.nextInt();
			if(input >= 0)
			{
				System.out.print("valid input \n");
				break;
			}
			else
				System.out.print("not valid input \n");
		}
	}
}
