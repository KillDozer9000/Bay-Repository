package p5;

public class CompareTester 
{
	public static void main(String[] args)
	{
		Compare c1 = new Compare(1.9888, 1.9999);
		System.out.println(c1.round());
		System.out.println(c1.differ());
		
		if(c1.differ() > 0.01)
			System.out.println("More than 0.01");
		else if(c1.differ() == 0.1)
			System.out.println("Equals 0.01");
		else
			System.out.println("Less than 0.01");
	}
}
