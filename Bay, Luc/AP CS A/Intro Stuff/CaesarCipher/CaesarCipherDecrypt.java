package CaesarCipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaesarCipherDecrypt
{

	public static String encryptmessage(String beforemessage, int key)
	{
		char afterletter = 0;
		int intencletter = 0;
		char beforeletter = 0;
		String aftermessage = "";

		for (int counter = 0; counter < beforemessage.length(); counter++)
		{
			beforeletter = beforemessage.charAt(counter);

			if (key > 26)
				key = key - 26;

			intencletter = beforeletter + key;

			if (intencletter > 122)
				intencletter = intencletter - 26;

			afterletter = (char) intencletter;

			if (beforeletter == ' ')
				afterletter = beforeletter;

			aftermessage += afterletter;
		}

		return aftermessage;
	}

	public static boolean checkword(String word) throws FileNotFoundException
	{
		Scanner fromDict = new Scanner(new File("/usr/share/dict/words"));
		while (fromDict.hasNextLine())
		{
			if (word.equals(fromDict.nextLine()))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException // Help me by 5 = mjqu rj
	{
		int key = 0;
		char first = 0;
		String decryptedmessage = "";
		Scanner fromKeyboard = new Scanner(System.in);

		System.out.print("Put in your encrypted message: ");
		decryptedmessage = fromKeyboard.nextLine();

		int length = decryptedmessage.length();
		Scanner decrypted = new Scanner(decryptedmessage);

		while (decrypted.hasNext())
		{
			if (checkword(decrypted.next()) == false)
			{
				System.out.print("false \n");
				key++;
				decryptedmessage = encryptmessage(decryptedmessage, key);

			} else
				break;
		}
		System.out.print("Your message is: " + decryptedmessage + "\n");
		System.out.print("The key is: " + key + "\n");
	}
}