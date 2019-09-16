package p4;

public class Pair 
{
	private double n1;
	private double n2;
	
	public Pair(double num1, double num2)
	{
		n1 = num1;
		n2 = num2;
	}
	
	public double sum()
	{
		return n1+n2;
	}
	public double dif()
	{
		return n1-n2;
	}
	public double prod()
	{
		return n1*n2;
	}
	public double average()
	{
		return (n1+n2)/2;
	}
	public double dist()
	{
		if((n1-n2)<0)
			return (n1-n2)*-1;
		else
			return n1-n2;
	}
	public double max()
	{
		if(n1 > n2)
			return n1;
		else
			return n2;
	}
	public double min()
	{
		if(n1 < n2)
			return n1;
		else
			return n2;
	}
}
