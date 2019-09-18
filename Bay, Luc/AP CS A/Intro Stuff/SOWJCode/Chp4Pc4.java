package SOWJCode;

public class Chp4Pc4 
{
	public static void main(String[] args)
	{
		int number = 30;
		double discount = 0;
		double total = 0;
     
    	 	if(10 <= number && number <= 19)
       		 discount = .2;  
     	 else if(20 <= number && number <= 49)
     		 discount = .3;   
     	 else if(50 <= number && number <= 99)
     		 discount = .4;         
     	 else
     		 discount = .5;
    
    total = (99*number) * (1-discount);
    System.out.print("Your sale is: " + total + "\n");
	}
}
