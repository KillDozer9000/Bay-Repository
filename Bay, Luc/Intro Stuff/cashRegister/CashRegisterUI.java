package cashRegister;

import java.util.Scanner;

public class CashRegisterUI
{
	Scanner fromkeyboard;
	private CashRegister cashregister;
    /**
     * Constructs a CashRegisterUI ready to start a transaction.
     */
    public CashRegisterUI()
    {
    		fromkeyboard = new Scanner(System.in);	
    		cashregister = new CashRegister();
    }
    
    double acceptValidPrice() // package access for testing
    {
    		boolean ok = false;
    		double doubleprice = 0;
    		String strprice = "";
    		while(ok != true)
    		{
        		System.out.println("Put the price of your item: ");
    			strprice = fromkeyboard.nextLine();
    			if(isDouble(strprice))
    			{
    				doubleprice = Double.parseDouble(strprice);
    				if(doubleprice > 0)
        				ok = true;
        			else
        				System.out.println("Not valid input");
    			}
    			else
    			{
    				if(strprice.equals(""))
        			{
        				doubleprice = -1;
        				ok = true;
        			}
    				else
    					System.out.println("Not valid input");
    			}
    			
    		}
    		return doubleprice;
    }
   
    void acceptAllItemsAndDisplayTotal() // package access for testing
    {
    		double price = 0;
    		int items = 0;

    		while(price != -1)
    		{
    			price = acceptValidPrice();
    			if(price != -1)
    			{
    				cashregister.addItem(price);
    				items++;
    			}
    			
    			while(items==0)
    			{
            		System.out.println("You need at least one item");
            		price = acceptValidPrice();
            		
        			if(price != -1)
        			{
        				items++;
        				cashregister.addItem(price);
        			}
    			}
    		}	
    		System.out.println(cashregister.getTotal());
        // TODO: implement acceptAllItemsAndDisplayTotal
    		
    }
    
    void acceptValidPaymentAndDisplayChange() // package access for testing
    {
    		double total = 0;
    		total = cashregister.gettotaltax();
    		total = cashregister.rounding(total);
    		boolean ok = false;
    		double change = 0;
    		double doublepayment = 0;
    		System.out.println("The total is: $"+ total);
    		System.out.print("Please put your payment: $");
    		
    		while(ok != true)
    		{
    			
    			String payment = fromkeyboard.nextLine();
    			if(isDouble(payment))
    				doublepayment = Double.parseDouble(payment);
    			else if(isDouble(payment) != true)
    				System.out.println("Not valid input");
    		
    			if(doublepayment < total)
    				System.out.println("Not enough money");
    			else
    				ok = true;
    		}
    		change = doublepayment - total;
    		
    		System.out.print("Your change is: $"+cashregister.rounding(change));
    }
    

    public void conductTransaction()
    {
    		acceptAllItemsAndDisplayTotal();
    		acceptValidPaymentAndDisplayChange();
    		
    }
    
    private static boolean isDouble(String value)
    {
        try
        {
            Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
        return true;
    }
}