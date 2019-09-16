package p10;

public class HourlyWorker extends Worker
{	
	public HourlyWorker(String name, int salary)
	{
		super(name, salary);
	}
	
	public double computePay(int hours)
	{
		if(hours > 40)
			return 40*salary() + (hours-40)*salary()*0.5;
		
		return 40*salary();
	}
}
