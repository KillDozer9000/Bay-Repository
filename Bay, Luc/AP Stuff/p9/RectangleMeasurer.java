package p9;

public class RectangleMeasurer implements Measurable
{
	private int width, height;
	public RectangleMeasurer(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public double getMeasure()
	{
		return (width*2) + (height*2);
	}
}
