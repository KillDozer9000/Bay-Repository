package p9;

public class CompRunner 
{

	public static void main(String[] args) 
	{
		CompDataSet d1 = new CompDataSet();
		CompDataSet d2 = new CompDataSet();
		
		String s1 = "b";
		String s2 = "a";
		
		d1.add(s1);
		d2.add(s2);
		
		System.out.println(d1.compareTo(d2));

	}

}
