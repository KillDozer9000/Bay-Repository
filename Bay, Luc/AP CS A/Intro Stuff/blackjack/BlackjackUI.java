package blackjack;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * A text based user interface that allows the user to
 * play a game of blackjack.
 */
public class BlackjackUI
{
	private Blackjack bj;
	private Scanner fromKeyboard;
	private NumberFormat nf;
	
	public BlackjackUI()
	{
		bj = new Blackjack(1000);
		fromKeyboard = new Scanner(System.in);
	}
	
	/**
     * Returns a valid numerical bet obtained from the player
     * @return a valid numerical bet obtained from the player
     */
    private double getValidBet()
    {	
    		return bj.getPlayersBet();
    }
    
    public void playHand()
    {
    		System.out.println("Starting Money: $"+ bj.getPlayersMoney());
    		
    		System.out.print("Put your bet: $");
    		String strbet = fromKeyboard.next();
    		double bet = stringToNumber(strbet);
    		while(bet < 1 || bet > bj.getPlayersMoney())
    		{
        		System.out.print("Invalid, put your bet: $");
        		strbet = fromKeyboard.next();
        		bet = stringToNumber(strbet);
    		}
    			
    		bj.placeBetAndDealCards(bet);
    		System.out.println("");
    		System.out.println("Player Cards: "+ bj.getPlayersHand());
    		System.out.print("Dealer Card: "+ bj.getDealersFirst()+" Hidden");//needs to only show one card
    		System.out.println("");
    		
    		if(bj.isPlayerBlackjack())
    		{
    			bj.resolveBetsAndReset();
    			System.out.println("You got blackjack!");
    			
    		}
    		else
    		{
    			int hit = 1;
    			while(hit == 1 && bj.canHit())
    			{
    				System.out.println("");
    				System.out.print("Do you want to hit? (1=yes, 2=no): ");
    				hit = fromKeyboard.nextInt();
    				if(hit == 1)
    					bj.hit();
    				System.out.println("Player Cards: "+ bj.getPlayersHand());
    				System.out.println("");
    			}
    			System.out.println("");
    			System.out.println("Dealers Turn!");
    			bj.playDealersHand();
    			System.out.println("Dealer Cards: "+ bj.getDealersHand());
    			System.out.println("");
    			
    			bj.resolveBetsAndReset();
    		}
    		System.out.println("Total Money: $"+ bj.getPlayersMoney());
    		System.out.println("-------------------------------------------");
    		
    		
    }

    public void playHandsUntilQuit()
    {
        System.out.print("Play another hand? (yes=1, no=2): ");
        String strresponse = fromKeyboard.next();
        double response = stringToNumber(strresponse);
    		while(response == 1 && bj.getPlayersMoney() > 1)
    		{
    			playHand();
    			System.out.print("Play another hand? (yes=1, no=2): ");
        		strresponse = fromKeyboard.next();
        		response = stringToNumber(strresponse);
        	}
        System.out.println("");
        System.out.println("Final Payout: $"+ bj.getPlayersMoney());
        System.out.print("Net gain: $"+(bj.getPlayersMoney()-1000));
    }

	/**
	 * Returns the numeric representation of input or -1 if input is not numeric
	 * @param input the value to be converted to a number
	 * @return numeric representation or -1
	 */
    
	private double stringToNumber(String input)
	{
		try
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}
}
