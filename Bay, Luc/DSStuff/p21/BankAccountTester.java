package p21;

public class BankAccountTester
{

   public static void main(String[] args)
   {
      BankAccount b1 = new BankAccount();
      b1.deposit(2000);
      b1.withdraw(500);
      System.out.println(b1.getBalance());
   }
}
