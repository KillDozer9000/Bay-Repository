package p4;

public class EasterRunner 
{
	public static void main(String[] args)
	{
		Easter e = new Easter(2001);
		
		System.out.println("Month: "+e.getEasterMonth());
		System.out.println("Day: "+e.getEasterDay());
		System.out.println("Year: "+e.getEasterYear());
	}
}
