package p4;

import java.util.Scanner;

public class P4_12 
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		String snum = fromKeyboard.nextLine();

		
		for(int i=0; i<snum.length(); i++)
			System.out.println(snum.substring(snum.length()-(i+1),snum.length()-i));
	}
}
