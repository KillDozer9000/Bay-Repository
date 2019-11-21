package p21;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
	private double balance;
	
   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   public double getBalance()
   {   
      return balance;
   }
   
   public int hashCode()
   {
	   return (int) (balance * 31 * 100);
   }
   
   public boolean equals(BankAccount b1)
   {
	   return b1.hashCode() == hashCode();
   }
}
