package p5;

public class Compare 
{
	private double n1, n2;
	public Compare(double n1, double n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public boolean round()
	{
		double rn1 = Math.round(n1*100);
		rn1 /= 100;
		
		double rn2 = Math.round(n2*100);
		rn2 /= 100;
		
		if(rn1 == rn2)
			return true;
		else
			return false;
	}
	
	public double differ()
	{
		double diff = n1- n2;
		return Math.abs(diff);
	}
}
