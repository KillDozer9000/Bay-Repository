package blackjack;

import java.util.ArrayList;

/**
 * The Blackjack class allows a single player to play a game of blackjack.
 * The class tracks the player's bankroll but makes no attempt to prevent
 * a negative bankroll.
 *
 */
public class Blackjack
{
	private static final int DECKS = 6, CARDS_PER_DECK = 52;
	private static final double SHOE_PENETRATION = 0.75;
	
    private Shoe shoe;
    
    private double playersMoney;
    
    private Hand playersHand;
    private double playersBet;
    
    private Hand dealersHand;
    
    public Blackjack(double playermoney)
    {
    		shoe = new Shoe(DECKS);
    		playersMoney = playermoney;
    }
    
    private void reset()
    {
        shoe.reset();
        playersBet = 0;
        playersHand = null;
        dealersHand = null;
    }
    
    public double getPlayersMoney()
    {
        return playersMoney;
    }
    
    public double getPlayersBet()
    {
        return playersBet;
    }

    public void placeBetAndDealCards(double amount)
    {
        playersBet = amount;
        playersMoney -= playersBet;
        Hand testhand1 = new Hand(shoe.dealCard(), shoe.dealCard());
        Hand testhand2 = new Hand(shoe.dealCard(), shoe.dealCard());
        playersHand = new Hand(testhand1.getCards().get(0), testhand2.getCards().get(0));
        dealersHand = new Hand(testhand1.getCards().get(1), testhand2.getCards().get(1));
        
    }
    
    public Hand getPlayersHand()
    {
        return playersHand;
    }
    
    public Hand getDealersHand()
    {
        return dealersHand;
    }
    
    public Card getDealersFirst()
    {
        return dealersHand.getCards().get(0);
    }
    
    public boolean canHit()
    {
    		if(playersHand.getValue() >= 21)
    			return false;
    		else if(dealersHand.getValue() == 21)
    			return false;
    		else
    			return true;
    }
    
    public void hit()
    {
        playersHand.addCard(shoe.dealCard());
    }

    public void playDealersHand()
    {
        while(dealersHand.getValue() < 17)
        		dealersHand.addCard(shoe.dealCard());
    }
    
    public boolean isPush()
    {
    		if(playersHand.getValue() == dealersHand.getValue())
    			return true;
    		else
    			return false;
    }
    
    public boolean isPlayerWin()
    {
    		if(playersHand.getValue() > dealersHand.getValue() || dealersHand.getValue() > 21)
    			return true;
    		else
    			return false;
    }
    
    public boolean isPlayerBlackjack()
    {
        return playersHand.isBlackjack();
    }

    public void resolveBetsAndReset()
    {
    		playersMoney += playersBet;
    		if(isPlayerBlackjack())
    			playersMoney += (playersBet * 1.5);
    		else if(playersHand.getValue() > 21 && dealersHand.getValue() > 21)
    		{
    			System.out.println("Both went over!");
    			playersMoney -= playersBet;
    		}
    		else if(playersHand.getValue() > 21)
    		{
    			System.out.println("You went over!");
    			playersMoney -= playersBet;
    		}
    		else if(dealersHand.getValue() > 21)
    		{
    			System.out.println("Dealer went over!");
    			playersMoney += playersBet;
    		}
    		else if(playersHand.getValue() > dealersHand.getValue())
    		{
    			System.out.println("You are higher!");
    			playersMoney += playersBet;
    		}
    		else if(playersHand.getValue() < dealersHand.getValue())
    		{
    			System.out.println("Dealer is higher!");
    			playersMoney -= playersBet;
    		}
    		else if(playersHand.getValue() == dealersHand.getValue())
    		{
    			System.out.println("Equal Value!");
    			playersMoney = playersMoney;
    		}
    }
}
