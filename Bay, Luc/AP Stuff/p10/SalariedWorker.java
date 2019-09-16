package p10;

public class SalariedWorker extends Worker
{
	
	public SalariedWorker(String name, int salary)
	{
		super(name, salary);
	}
	
	public double computePay(int hours)
	{
		return 40*salary();
	}
}
