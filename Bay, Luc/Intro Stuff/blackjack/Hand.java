package blackjack;

import java.util.ArrayList;

/**
 * Represents all or part player's or dealer's blackjack hand
 */
public class Hand
{
    private ArrayList<Card> cards;
    
    /**
     * Constructs a hand containing the specified 2 cards
     * @param card1 the first card
     * @param card2 the second card
     */
    public Hand(Card card1, Card card2)
    {
        cards = new ArrayList<Card>();
        cards.add(card1);
        cards.add(card2);
    }

    /**
     * Returns the numerical value of this hand according to the rules of blackjack
     * @return the numerical value of this hand
     */
    public int getValue()//done
    {
    		int total = 0;
    		boolean ace = false;
    		for(int i =0; i < cards.size(); i++)
    		{
    			Card card = cards.get(i);
    			int value = card.getValue();

    			if(value == 11 || value == 12 || value == 13)
    				value = 10;
    			if(value == 1)
    				ace = true;
    			total += value;
    		}
    		if(ace && (total+10) <= 21)
    			total += 10;
        return total;
    }

    /**
     * Returns true if this hand is a blackjack, false otherwise
     * @return true if this hand is a blackjack, false otherwise
     */
    public boolean isBlackjack()//done
    {
        if(getValue() == 21 && cards.size() == 2)
        		return true;
        	else
        		return false;
    }

    /**
     * Returns the cards in this hand
     * @return the cards in this hand
     */
    public ArrayList<Card> getCards()//done
    {
    		return cards;
    }
    
    /**
     * Returns the cards in this hand followed by their numerical value
     * Ex: JS AH (21)
     */
    public String toString()
    {
    		String card = "";
    		for(int i = 0; i < cards.size(); i++)
    		{
    			card += cards.get(i)+ " ";
    		}
        return card + "("+getValue()+")";
    }

    /**
     * Adds the specified card to this hand
     * @param card the card to add
     */
    public void addCard(Card card)
    {
        cards.add(card);
    }

    /**
     * Returns the number of cards in this hand
     * @return the number of cards in this hand
     */
    public int getNumCards()
    {
        return cards.size();
    }
}