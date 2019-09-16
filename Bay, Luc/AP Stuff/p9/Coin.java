package p9;

/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
   
   public int compareTo(Coin x)
   {
	   if(value > x.getValue())
		   return -1;
	   else if(value < x.getValue())
		   return 1;

	   return 0;
   }

   private double value;
   private String name;
}
