package p4;

public class DataSetRunner1 
{
	public static void main(String[] args)
	{
		DataSet1 d1 = new DataSet1(15);
		d1.addValue(20);
		d1.addValue(15);
		
		System.out.println("Sum: "+d1.getSum());
		System.out.print("Average: "+d1.getAverage());
	}
}
