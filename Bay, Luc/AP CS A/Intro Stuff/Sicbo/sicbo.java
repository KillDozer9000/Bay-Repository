
	package Sicbo;
	import java.util.Scanner;
	public class sicbo 
	{
		private static Scanner fromKeyboard = new Scanner(System.in);
		
		public static int takeBalance()
		{
			System.out.print("How much are you playing with?: $");
			int initialBalance = fromKeyboard.nextInt();
			fromKeyboard.nextLine();
			
			while(initialBalance <= 0 )
			{	
				System.out.println("Invalid input");
				initialBalance = fromKeyboard.nextInt();
				fromKeyboard.nextLine();
			}
			return initialBalance;
		}
		
		public static int takeBet(int balance)
		{
			System.out.print("How much are you betting?: $");
			int bet = fromKeyboard.nextInt();
			fromKeyboard.nextLine();
			
			while(bet <= 0 || bet > balance)
			{	
				System.out.println("Invalid input");
				bet = fromKeyboard.nextInt();
				fromKeyboard.nextLine();
			}
			return bet;
		}
		
		public static int takeBetType()
		{
			System.out.println("BETS:");
			System.out.println("  1 = Big Bet.");
			System.out.println("  2 = Small Bet.");
			System.out.println("  3 = Triple Bet.");
			System.out.print("What is your Choice?: ");
			int betType = -1;
			int input = 0;
			
			while(betType < 0)
			{	
				input = fromKeyboard.nextInt();
				fromKeyboard.nextLine();
				if(input == 1 || input == 2 || input == 3)
					betType = 1;
				else
					System.out.println("Invalid input");
			}
			return input;
		}
		
		public static int rolldice() 
		{
			double rolls = 0;
			rolls = Math.random() * 6 + 1;
			int introll = (int) rolls;
			return introll;
		}
		
		public static boolean isplay()
		{
			System.out.print("Do you want to play (y/n): ");
			String input = fromKeyboard.nextLine();
			
			while(!input.equals("y") && !input.equals("n"))
			{
				input = "";
				System.out.print("Invalid input \n");
				input = fromKeyboard.nextLine();
				System.out.print(input + "\n");
			}
			
			if(input.equals("y"))
				return true;
			else if(input.equals("n"))
				return false;
			else
				return false;
		}
		
		public static int taketriple()
		{
			System.out.println("What is your triple?: ");
			int triple = fromKeyboard.nextInt();
			fromKeyboard.nextLine();
			
			while(triple <= 0 || triple > 6)
			{	
				System.out.println("Invalid input");
				triple = fromKeyboard.nextInt();
				fromKeyboard.nextLine();
			}
			
			return triple;
		}
		
		public static int big(int dietotal, int bet) // TODO: limit what this method will do
		{
			int payout = 0;
			payout -= bet;
			if(dietotal >= 11 && dietotal <= 17)
			{
				payout += bet*2;
				System.out.print("You won! \n");
			}
			else
				System.out.print("You lost! \n");
			System.out.print("Roll total: "+dietotal+ "\n");
			return payout;
		}
		
		public static int small(int dietotal, int bet) // TODO: limit what this method will do
		{
			int payout = 0;
			payout -= bet;
			if(dietotal >= 4 && dietotal <= 10)
			{
				payout += bet*2;
				System.out.print("Roll total: "+dietotal+ "\n");
				System.out.print("You won! \n");
			}
			else
			{
				System.out.print("Roll total: "+dietotal+ "\n");
				System.out.print("You lost! \n");
			}
			
			return payout;
		}
		
		public static int triples(int roll1, int roll2, int roll3, int number, int bet) // TODO: limit what this method will do
		{
			int payout = 0;
			payout -= bet;
			
			if(number == 1 && roll1 == 1 && roll2 == 1 && roll3 == 1)
				payout += bet*151;
			
			else if(number == 2 && roll1 == 2 && roll2 == 2 && roll3 == 2)
				payout += bet*151;
			
			else if(number == 3 && roll1 == 3 && roll2 == 3 && roll3 == 3)
				payout += bet*151;
			
			else if(number == 4 && roll1 == 4 && roll2 == 4 && roll3 == 1)
				payout += bet*151;
			
			else if(number == 5 && roll1 == 5 && roll2 == 5 && roll3 == 5)
				payout += bet*151;
			
			else if(number == 6 && roll1 == 6 && roll2 == 6 && roll3 == 6)
				payout += bet*151;
			
			return payout;
		}
		
		public static void main(String[] args) 
		{
			boolean play = true;
			int balance = takeBalance();
			while(play && balance > 0)
			{
				int bettype = takeBetType();
				int bet = takeBet(balance);
				int roll1 = rolldice();
				int roll2 = rolldice();
				int roll3 = rolldice();
				int number = 0;
				
				if(bettype == 3)
					number = taketriple();
				
				System.out.print("Roll 1: "+roll1+ "\n");
				System.out.print("Roll 2: "+roll2+ "\n");
				System.out.print("Roll 3: "+roll3+ "\n");
				if(bettype == 1)
				{
					balance += big(roll1+roll2+roll3, bet);
					System.out.print("Your balance is now: $"+balance+ "\n");
				}
				else if(bettype == 2)
				{
					balance += small(roll1+roll2+roll3, bet);
					System.out.print("Your balance is now: $"+balance+ "\n");
				}
				else if(bettype == 3)
				{
					balance += triples(roll1, roll2, roll3, number, bet);
					System.out.print("Your balance is now: $"+balance+ "\n");
				}
				play = isplay();
			}
			System.out.print("Your end balance is now: $"+balance+ "\n");
		}
		
	}
