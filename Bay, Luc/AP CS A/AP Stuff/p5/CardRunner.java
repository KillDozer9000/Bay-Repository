package p5;

public class CardRunner 
{

	public static void main(String[] args) 
	{
		
		Card c = new Card("1S");
		System.out.println(c.getDescription());
		
		Integer i = new Integer(20);
		Integer j = new Integer(20);
		Object ob = new Integer(3);
		Double doub = new Double(3.0);
		String s1 = "TOMATO";
		String s2 = "aatomato";
		String s3 = "tom";
		
		int x = s2.indexOf(s3);
		System.out.println(s2.substring(x, s3.length()+x) + s3.equals(s2.substring(x, s3.length()+x)));
	}

}
