package p7;

public class PurseRunner 
{

	public static void main(String[] args) 
	{
		Purse p1 = new Purse();
		Purse p2 = new Purse();
		
		p2.addCoin("Dime");
		p2.addCoin("Nickle");
		p2.addCoin("Quarter");
		
		p1.addCoin("Quarter");
		p1.addCoin("Dime");
		p1.addCoin("Nickle");
	
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1.sameContents(p2));
		System.out.println(p1.sameCoins(p2));
		
	}

}
