package CaesarCipher;

import java.util.Scanner;

public class CaesarCipherSentence
{
	int key = 0;
	
	public static char encryptLetter (char beforeletter, int key)
	{
		char afterletter = 0;
		int intencletter = 0;
		
		if(key > 26)
			key = key - 26;
		
		intencletter = beforeletter + key;
		
		if(intencletter > 122)
			intencletter = intencletter - 26;

		afterletter = (char) intencletter;
		
		if(beforeletter == ' ')
			afterletter = beforeletter;
		
		return afterletter;
		
	}
	public static void main(String[] args)
	{
		Scanner fromKeyboard = new Scanner(System.in);
		char first = 0;
		String finalmessage = "";
		
		System.out.print("Put in your message: ");
		String message  = fromKeyboard.nextLine();
		
		System.out.print("Put in your key: ");
		int key  = fromKeyboard.nextInt();
		
		System.out.print("Your message is: ");
		
		int length = message.length();
		
		for(int counter = 0;counter<length;counter++)
		{
			first = message.charAt(counter);
			finalmessage += encryptLetter(first, key);
		}
		System.out.print(finalmessage);
	}
}
