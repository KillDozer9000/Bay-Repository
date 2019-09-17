package p9;

public class QuizRunner
{

	public static void main(String[] args)
	{
		DataSet d1 = new DataSet();
		
		d1.add(new Quiz(87, "B+"));
		d1.add(new Quiz(94, "A"));
		d1.add(new Quiz(98, "A+"));
		d1.add(new Quiz(81, "B-"));
		
		System.out.println("Highest Score: "+d1.getMaximum().getMeasure());
		System.out.println("Average Score: "+d1.getAverage());
	}

}
