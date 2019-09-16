package p4;

public class DataSet1 
{
	private int total;
	private int valuecount;
	
	public DataSet1(int first)
	{
		total = first;
		valuecount++;
	}
	
	public void addValue(int x)
	{
		total += x;
		valuecount++;
	}
	
	public int getSum()
	{
		return total;
	}
	
	public double getAverage()
	{
		return total/valuecount;
	}
}
