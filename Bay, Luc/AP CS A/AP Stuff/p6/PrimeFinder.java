package p6;

public class PrimeFinder 
{
	private int num = 0;
	
	public PrimeFinder(int num)
	{
		this.num = num;
	}
	
	public String getPrimes()
	{
		String primes= "";
		
		for(int i=1;i<=num;i++)
		{
			FactorGenerator f1 = new FactorGenerator(i);
			f1.getFactors();
			if(f1.getFnum() == 2)
				primes += i+", ";
		}
		return primes;
	}
}
