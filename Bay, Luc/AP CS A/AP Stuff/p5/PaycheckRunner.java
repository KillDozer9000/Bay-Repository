package p5;

public class PaycheckRunner {

	public static void main(String[] args)
	{
		Paycheck p1 = new Paycheck(8.50, 50);
		System.out.println("Weekly pay: $"+p1.compute());
	}
}
