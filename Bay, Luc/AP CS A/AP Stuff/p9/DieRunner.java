package p9;

public class DieRunner 
{

	public static void main(String[] args) 
	{
		Die d1 = new Die(6);
		Die d2 = new Die(6);
		Die d3 = new Die(6);
		
		d1.cast();
		d2.cast();
		d3.cast();
		
		DataSet dieset = new DataSet();
		
		dieset.add(d1);
		dieset.add(d2);
		dieset.add(d3);
		
		System.out.println("Average roll: "+ dieset.getAverage());
		System.out.println("Highest roll: "+ dieset.getMaximum().getMeasure());
		System.out.println("Lowest roll: "+ dieset.getMinimum().getMeasure());
		
//		CompDataSet compset = new CompDataSet();
//		
//		compset.add(new String("Hello"));
		

	}

}
