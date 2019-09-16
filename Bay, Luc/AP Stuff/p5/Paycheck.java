package p5;

public class Paycheck 
{
	double w, hr;
	public Paycheck(double wage, double hours)
	{
		w = wage;
		hr = hours;
	}
	
	public double compute()
	{
		double pay = 0;
		
		if(hr > 40)
			pay += (w*1.5)*(hr-40);
		
		pay += w*hr;
		return pay;
	}
}
