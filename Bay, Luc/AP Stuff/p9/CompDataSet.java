package p9;

/**
 * Computes the average of a set of data values.
 */
public class CompDataSet implements Comparable<CompDataSet>
{
	private String maximum, minimum, value;
	int count;

	/**
	 * Constructs an empty data set.
	 */
	public CompDataSet()
	{
		maximum = null;
		minimum = null;
		count = 0;
		value = "";
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x a data value
	 */
	public void add(String x)
	{
		if (count == 0 || maximum.compareTo(x) > 0)
			maximum = x;
		if(count == 0 || minimum.compareTo(x) < 0)
			minimum = x;
		
		value += x;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public String getMaximum()
	{
		return maximum;
	}
	
	public String getMinimum()
	{
		return minimum;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public int compareTo(CompDataSet x)
	{
		if(value.compareTo(x.getValue()) > 0)
				return -1;
		else if(value.compareTo(x.getValue()) < 0)
			return 1;
		
		return 0;
	}
}