package SOWJCode;

import java.util.Scanner;

public class Chp5Pc1
{
	static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{	
		int product = 1;
		System.out.print("put a number: \n");
		int input = fromKeyboard.nextInt();
		for(;input>=0; input--)
			product = product+input;
		
		System.out.print(product+"\n");
	}
}