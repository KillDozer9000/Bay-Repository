package p7;

import java.util.ArrayList;

public class Purse 
{
	ArrayList<String> coins;
	
	public Purse()
	{
		coins = new ArrayList<String>();
	}
	
	public void addCoin(String coinname)
	{
		coins.add(coinname);
	}
	
	public String toString()
	{
		return "Purse"+coins.toString();
	}
	
	public void purseReverse()
	{
		ArrayList<String> rcoins = new ArrayList<String>();
		
		for(int i=0; i<coins.size(); i++)
			rcoins.add(coins.get(coins.size()-1-i));
		
		coins = rcoins;
	}
	
	public void transfer(Purse other)
	{
		for(int i=0; i<other.coins.size();i++)
		{
			coins.add(other.coins.get(i));
			other.coins.remove(i);
			i--;
		}
	}
	
	public boolean sameContents(Purse other)
	{
		
		if(coins.size() != other.coins.size())
			return false;
		
		for(int i=0; i<coins.size(); i++)
			if(coins.get(i) != other.coins.get(i))
				return false;
		
		return true;
	}
	
	public boolean sameCoins(Purse other)
	{
		int q = 0;
		int d = 0;
		int n = 0;
		
		for(int i =0; i<coins.size(); i++)
		{
			if(coins.get(i).equals("Quarter"))
				q++;
			else if(coins.get(i).equals("Dime"))
				d++;
			else
				n++;
		}
		
		for(int i=0; i<other.coins.size(); i++)
		{
			if(other.coins.get(i).equals("Quarter"))
				q--;
			else if(other.coins.get(i).equals("Dime"))
				d--;
			else
				n--;
		}
		
		return d == 0 && q == 0 && n == 0;
	}
	
	
}
