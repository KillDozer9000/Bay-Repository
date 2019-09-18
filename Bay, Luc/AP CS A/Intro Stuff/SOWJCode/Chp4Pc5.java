package SOWJCode;

public class Chp4Pc5 
{
	public static void main(String[] args)
	{
		int checks = 30;
		int months = 2;
		double checkfee = 0;
		double total = 0;
    
    		if(checks <= 19)
			checkfee = .10;
		else if(20 <= checks && checks <= 39)
			checkfee = .08;
		else if(40 <= checks && checks <= 59)
			checkfee = .06;
		else
			checkfee = .04;
		
		total = 10*months + checkfee*checks;
		
		if(total < 400)
			total = total + 15;
		
		System.out.print("Your total is: " + total + "\n");
			
			
	}
}
