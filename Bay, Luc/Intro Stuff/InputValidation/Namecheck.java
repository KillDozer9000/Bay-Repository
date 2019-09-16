package InputValidation;

import java.util.Scanner;

public class Namecheck
{
	static Scanner fromKeyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String yes = "yes";
		String no = "no";
		int lengthy = yes.length();
		int lengthn = no.length();
		int indexy = -1;
		int indexn = -1;
		while(indexy == -1 && indexn == -1)
		{
			System.out.print("put in yes or no: \n");
			String input = fromKeyboard.nextLine();
			int inlength = input.length();
			indexy = input.indexOf(yes);
			indexn = input.indexOf(no);
			if(indexy != -1 && inlength == lengthy)
			{
				System.out.print("Valid Input \n");
				break;
			}
			else if(indexn != -1 && inlength == lengthn)
			{
				System.out.print("Valid Input \n");
				break;
			}
			else
				System.out.print("Invalid Input \n");
		}
	}
}
