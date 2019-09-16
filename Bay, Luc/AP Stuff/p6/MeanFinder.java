package p6;

import java.util.ArrayList;

public class MeanFinder 
{
	private ArrayList<Double> values;
	
	public MeanFinder()
	{
		values = new ArrayList<Double>();
	}
	
	public void addVal(double val)
	{
		values.add(val);
	}
	
	public String toString()
	{
		return values.toString();
	}
	
	public int getSize()
	{
		return values.size();
	}
	
	public double getAverage()
	{
		double sum = 0;
		
		for(int i=0; i < values.size(); i++)
			sum += values.get(i);
		
		return sum/values.size();
	}
	
	public double getSD()
	{
		double SDmean = 0;
		for(int i=0; i < values.size();i++)
			SDmean += Math.pow(values.get(i)-getAverage(), 2);
		
		return Math.sqrt(SDmean/getSize());
	}
}
