package p4;

public class CashRegister 
{
	private double total;
	
	public CashRegister()
	{
	}
	
	public void recordPurchase(double t)
	{
		total = t;
	}
	
	public void enterPayment(int dol, int qua, int dim, int nic, int pen)
	{
		total -= dol + (((qua*25)+(dim*10)+(nic*10)+pen)/100);
	}
	
	public int giveDollars()
	{
		return (int)total;
	}
	
	private int getCents()
	{
		int cents = (int)((total-((int)total))*100)+1;
		return cents;
	}
	
	public int giveQuarters()
	{
		return (int)(getCents()/25);
	}
	
	public int giveDimes()
	{
		return (int)((getCents()-(giveQuarters()*25))/10);
	}
	
	public int giveNickles()
	{
		return (int)((getCents()-(giveQuarters()*25)-(giveDimes()*10))/5);
	}
	
	public int givePennies()
	{
		return (int)((getCents()-(giveQuarters()*25)-(giveDimes()*10)-(giveNickles()*5)));
	}
}
