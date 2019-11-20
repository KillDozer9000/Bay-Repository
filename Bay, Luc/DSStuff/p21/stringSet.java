package p21;

import java.util.Scanner;
import java.util.TreeSet;

public class stringSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set1 = new TreeSet<String>();
		Scanner in = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
		String sent = in.nextLine();

		String temp = "";
		
		for(int i=0; i < sent.length(); i++)
		{
			if(sent.charAt(i) == ' ')
			{
				set1.add(temp);
				temp = "";
			}
			else
				temp += sent.charAt(i);
		}
		
		System.out.println(set1.toString());
		System.out.println("size: "+set1.size());
	}
}
