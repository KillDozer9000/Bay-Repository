package DataSet;

public class DataSet 
{
	private double total;
	private double valuecount;
	
	public DataSet(double first)
	{
		total = first;
		valuecount++;
	}
	
	public double add(double num)
	{
		valuecount++;
		total+=num;
		return total;
	}
	
	public double getsum()
	{
		return total;
	}
	
	public double getaverage()
	{
		return total/valuecount;
	}
}
