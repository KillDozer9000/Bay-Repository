package p13;

import java.util.ArrayList;

public class SubstringGenerator 
{

	public static ArrayList<String> subGen(String str)
	{
		ArrayList<String> subs = new ArrayList<String>();
		
		if(str.length() == 0)
			return subs;
		
		subs.add(str);
		subs.addAll(subGen(str.substring(0, str.length()-1)));
		subs.addAll(subGen(str.substring(1, str.length())));
		
		return subs;
	}
	
	public static void main(String[] args) 
	{
		System.out.print(subGen("rum").toString());

	}

}
