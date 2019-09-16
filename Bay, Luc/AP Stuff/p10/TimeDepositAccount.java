package p10;

public class TimeDepositAccount extends BankAccount
{
	private double rate;
	private int months;
	
	public TimeDepositAccount(double rate, int months)
	{
		this.rate = rate;
		this.months = months;
	}
	
	public void addInterest()
	{
		months--;
		
		double interest = getBalance() * rate / 100;
	    deposit(interest); 
	}
	
	public void withdraw(int amount)
	{
		if(months > 0)
			super.withdraw(amount+50);
		else
			super.withdraw(amount);
	}
}
