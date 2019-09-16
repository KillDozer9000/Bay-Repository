package p9;

/**
 * Computes the average of a set of data values.
 */
public class MeasurerDataSet<T>
{
	private double sum;
	private T maximum, minimum;
	private int count;
	private Measurer<T> measurer;

	/**
	 * Constructs an empty data set.
	 */
	public MeasurerDataSet(Measurer<T> measurer)
	{
		sum = 0;
		count = 0;
		maximum = null;
		minimum = null;
		this.measurer = measurer;
	}
	
	public MeasurerDataSet()
	{
		//something definitely goes here but unfortunately i dont know what
		//this((Measurer<T>) new MeasrableMeasurer());//turns out its this
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x a data value
	 */
	public void add(T x)
	{
		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
			maximum = x;
		if(count == 0|| measurer.measure(minimum) > measurer.measure(x))
			minimum = x;
		count++;
	}

	public double getAverage()
	{
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	public T getMaximum()
	{
		return maximum;
	}
	
	public T getMinimum()
	{
		return minimum;
	}
}