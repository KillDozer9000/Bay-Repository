package cashRegister;

public class CashRegister
{
	private double total;
	
    /**
     * Constructs a CashRegister with an active transaction.
     */
    public CashRegister()
    {
    	 	total = 0;
    }
    
    /**
     * Adds the item with the specified price to the active transaction.
     * 
     * @param price the item's price
     * Precondition: price >= 0
     */
    public void addItem(double price)
    {
        total += price;
    }
    
    public double getTotal()
    {
        return total;
    }
   
    public double acceptPayment(double amount)
    {
    		double change = amount - total;
    		total = 0;
    		return change;
    }
    public double rounding(double taxedtotal)
    {
    		//double taxedtotal = gettotaltax();
    		taxedtotal *= 100;
    		taxedtotal = Math.round(taxedtotal);
    		taxedtotal /= 100;
    		return taxedtotal;
    }
    public double gettotaltax()
    {
    		total = getTotal();
    		double tax = total * .075;
		total += tax;
		return total;
    }
}