package p7;

import java.util.ArrayList;
import java.util.Scanner;

public class AltSum 
{
	static Scanner k = new Scanner(System.in);
	
	
	
	public static void main(String[] args)
	{
		System.out.print(13-3*6/4%3);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum = 0;
		
		System.out.println("Enter numbers, 'end' to end");
		String num = k.nextLine();
		
		while(!(num.equals("end")))
		{
			nums.add(Integer.parseInt(num));
			num = k.nextLine();
		}
		
		
		for(int i=0; i<nums.size();i++)
		{
			if(i%2 == 0)
				sum += nums.get(i);
			else
				sum -= nums.get(i);
		}
		
		System.out.println("Sum: " +sum);
	}
}
