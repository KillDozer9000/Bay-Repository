package DataSet;

public class DataRunner 
{
	public static void main(String[] args)
	{
		DataSet test = new DataSet(10);
		
		System.out.println(test.getsum());
		test.add(10);
		System.out.println(test.getsum());
		System.out.println(test.getaverage());
	}
}
