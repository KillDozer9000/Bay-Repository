package p4;

public class CashRegisterRunner 
{
	public static void main(String[] args)
	{
		double total = 16.99;
		
		CashRegister c1 = new CashRegister();
		
		c1.recordPurchase(total);
		c1.enterPayment(10, 0, 0, 0, 0);
		
		System.out.println("Total: "+ total);
		System.out.println("\nDollars: "+c1.giveDollars());
		System.out.println("Quarters: "+c1.giveQuarters());
		System.out.println("Dimes: "+c1.giveDimes());
		System.out.println("Nickles: "+c1.giveNickles());
		System.out.println("Pennies: "+c1.givePennies());
		
	}
}
