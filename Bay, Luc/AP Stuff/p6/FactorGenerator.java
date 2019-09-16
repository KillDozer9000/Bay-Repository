package p6;

public class FactorGenerator 
{
	private int num, fnum;
	
	public FactorGenerator(int num)
	{
		this.num = num;
	}
	
	public String getFactors()
	{
		String factors = "";
		for(int i=1; i<=num; i++)
		{
			if(num/(double)i == (int)num/i)
			{
				factors += i+", ";
				fnum++;
			}
		}
		return factors;
	}
	
	public int getFnum()
	{
		return fnum;
	}
}
