package PracticeLoops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {

	public static int nonletter(String message) 
	{
		int count = 0;
		for (int position = 0; position < message.length(); position++) 
		{
			if ('A' >= message.charAt(position) || message.charAt(position) >= 'Z' && 'a' >= message.charAt(position) || message.charAt(position) >= 'z')
				count++;
		}

		return count;
	}

	public static int wordcount(String message) throws FileNotFoundException
	{
		int count = 0;
		Scanner scan = new Scanner(message);

		while (scan.hasNext()) 
		{
			scan.next();
			count++;
		}

		scan.close();
		return count;
	}

	public static String mixString(String a, String b) 
	{
		String end = "";
		int alength = a.length();
		int blength = b.length();
		int lenght = Math.max(blength, alength);

		for (int position = 0; position < lenght; position++) 
		{
			if (position <= alength - 1)
				end += a.charAt(position);
			if (position <= blength - 1)
				end += b.charAt(position);
		}
		return end;
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.print(nonletter("he.llo.there."));
		//System.out.print(wordcount("there are 4 words"));
		//System.out.print(mixString("hi", "there"));
	}
}
