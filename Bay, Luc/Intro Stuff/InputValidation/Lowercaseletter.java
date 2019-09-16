package InputValidation;

import java.util.Scanner;

public class Lowercaseletter
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		int intinput = 'B';
		while(intinput <= 'a' || intinput >= 'z')
		{
			System.out.print("put a lower case letter: \n");
			char input = fromKeyboard.nextLine().charAt(0);
			intinput = input;
			if(intinput >= 'a' && intinput <= 'z')
			{
				System.out.print("Valid input \n");
				break;
			}
			else
				System.out.print("Invalid input \n");
		}
	}
}
