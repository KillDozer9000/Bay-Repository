package p4;

import java.util.ArrayList;

public class DataSet2 
{
	private ArrayList<Double> values;
	
	public DataSet2(double first)
	{
		values = new ArrayList<Double>();
		values.add(first);
	}
	
	public void addValue(double x)
	{
		values.add(x);
	}
	
	public double getLargest()
	{
		double largest = values.get(0);
		
		for(int i=0; i < values.size();i++)
			if(values.get(i) > largest)
				largest = values.get(i);
		
		return largest;
	}
	
	public double getSmallest()
	{
		double smallest = values.get(0);
		
		for(int i=0; i < values.size();i++)
			if(values.get(i) < smallest)
				smallest = values.get(i);
		
		return smallest;
	}
}
