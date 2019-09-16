package CaesarCipher;

import java.util.Scanner;

public class CaesarCipher
{
	public static void main(String[] args)
	{
		Scanner fromKeyboard = new Scanner(System.in);
	
		char finalmessage = 0;
		int intmessage = 0;
		
		System.out.print("Put in your message: ");
		char letter  = fromKeyboard.nextLine().charAt(0);
		
		System.out.print("Put in your key : ");
		int key  = fromKeyboard.nextInt();

		int intletter = letter;
		
		if(key > 26)
			key = key - 26;
		
		intmessage = intletter + key;
		
		if(intmessage > 122)
			intmessage = intmessage - 26;
		
		finalmessage = (char) intmessage;
	
		System.out.print("Your message is: " + finalmessage + "\n");
	
	}
}

//Purpose: to encode a letter
//input: put in letter and key
//process: add key to letter and print
//output: display encoded letter

//Display "Put in your letter"
//Input letter
//Display"Put in your key"
//Input key
//Store variables
//Add key to letter
//if letter+key is more than 26, subtract 26
//if key is more than 26, subtract 26
//Print new letter

//get variables
//calculate letter
//print letter

//Put in your letter : a
//Put in your key : 1
//Your message is : b

//Put in your letter : z
//Put in your key : 2
//Your message is : b

//Put in your letter : a
//Put in your key : 27
//Your message is : b