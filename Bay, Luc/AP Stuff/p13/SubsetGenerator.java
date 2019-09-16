package p13;

import java.util.ArrayList;

public class SubsetGenerator
{
	public static void main(String[] args)
	{
		System.out.print(getSubsets("rum").toString());
	}

	public static ArrayList<String> getSubsets(String str)
	{
		ArrayList<String> subs = new ArrayList<String>();
		
		if(str.length() == 0)
			return subs;
		
		subs.add(str);
		subs.addAll(getSubsets(str.substring(0, str.length()-1)));
		subs.addAll(getSubsets(str.substring(1, str.length())));
		
		for(int i=1; i<str.length()-1; i++)
		{
			String temp = str.substring(0, i) + str.substring(i+1, str.length());
			subs.addAll(getSubsets(temp));
		}
		
		return subs;
	}
}