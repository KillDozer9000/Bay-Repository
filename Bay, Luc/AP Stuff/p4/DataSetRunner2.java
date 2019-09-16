package p4;

public class DataSetRunner2 
{
	public static void main(String[] args)
	{
		DataSet2 d1 = new DataSet2(1);
		
		d1.addValue(2);
		d1.addValue(28);
		d1.addValue(4);
		
		System.out.println("Max: "+d1.getLargest());
		System.out.println("Min: "+d1.getSmallest());
	}
}
