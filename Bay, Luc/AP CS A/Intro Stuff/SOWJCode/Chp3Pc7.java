package SOWJCode;

public class Chp3Pc7 
{
	private int test1, test2, test3;
	
	public Chp3Pc7(int t1, int t2, int t3)
	{
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	
	public int sett1(int t1)
	{
		test1 = t1;
		return test1;
	}	
	public int sett2(int t2)
	{
		test2 = t2;
		return test2;
	}
	public int sett3(int t3)
	{
		test3 = t3;
		return test3;
	}
	public int gett1()
	{
		return test1;
	}
	public int gett2()
	{
		return test2;
	}
	public int gett3()
	{
		return test3;
	}
	public double average()
	{
		return ((test1+test2+test3)/3);
	}
	
}
