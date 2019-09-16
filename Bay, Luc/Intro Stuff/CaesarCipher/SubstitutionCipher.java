//package CaesarCipher;
//
//import java.util.Scanner;
//
//public class SubstitutionCipher
//{
//
//	public static String encryptmessage(String message, String ciphabet)
//	{
//		char afterletter = 0;
//		char beforeletter = 0;
//		int position = 0;
//		String aftermessage = "";
//<<<<<<< HEAD
//=======
//		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//
//		for (int counter = 0; counter < message.length(); counter++)
//		{
//			beforeletter = message.charAt(counter);
//
//<<<<<<< HEAD
//			if (beforeletter == ' ' || beforeletter == '.' || beforeletter == ',' || beforeletter == '!'
//					|| beforeletter == '?')
//				return beforeletter;
//			else
//				position = ciphabet.indexOf(beforeletter);
//
//			afterletter = ciphabet.charAt(position);
//			aftermessage += afterletter;
//=======
//			if (beforeletter == ' ' || beforeletter == '.' || beforeletter == ',' || beforeletter == '!' || beforeletter == '?')
//				aftermessage += beforeletter;
//			else
//			{
//				position = alphabet.indexOf(beforeletter);
//				afterletter = ciphabet.charAt(position);
//				aftermessage += afterletter;
//			}
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//		}
//		return aftermessage;
//
//	}
//
//	public static String randomalpha()
//	{
//		String randalpha = "";
//		int randnum = 0;
//		char randletter = 0;
//<<<<<<< HEAD
//		int count = 0;
//		while (count < 25)
//=======
//		
//		randnum = (int) (Math.random() * 26) + 97;
//		randalpha += (char) randnum;
//		
//		for (int count = 0; count < 24;)
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//		{
//<<<<<<< HEAD
//			randnum = (int) (Math.random() * 26) + 65;
//=======
//			randnum = (int) (Math.random() * 26) + 97;
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//			randletter = (char) randnum;
//<<<<<<< HEAD
//
//			// System.out.print(randnum);
//			// System.out.print(" : "+randletter+"\n");
//=======
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//
//			if (randalpha.indexOf(randletter) == -1)
//			{
//				randalpha += randletter;
//				count++;
//<<<<<<< HEAD
//				// System.out.print("count: "+count);
//				// System.out.print(" alpha ="+randalpha+"\n");
//=======
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//			}
//		}
//		return randalpha;
//	}
//
//	public static void main(String[] args)
//	{
//		Scanner fromKeyboard = new Scanner(System.in);
//		String finalmessage = "";
//
//		System.out.print("Put in your message: ");
//		String message = fromKeyboard.nextLine();
//
//<<<<<<< HEAD
//		System.out.print("Your encrypted message is: ");
//
//		finalmessage += encryptmessage(message, randomalpha());
//		System.out.print(finalmessage);
//	}
//=======
//		String key = randomalpha();
//		finalmessage += encryptmessage(message, key);
//		System.out.print("Your random key is: "+key+"\n");
//		System.out.print("Your encrypted message is: " +finalmessage);
//	}	
//>>>>>>> branch 'master' of https://github.com/MLHS-AP-CS/cp-2017-2018-p1-KillDozer9000.git
//}
