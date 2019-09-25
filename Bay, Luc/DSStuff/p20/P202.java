package p20;

import java.util.LinkedList;

public class P202 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		
		reverse(ll);
		
	}
	
	public static void reverse(LinkedList<String> staff)
	{
		LinkedList<String> newstaff = new LinkedList<String>();
		
		for(int i=staff.size()-1; i >= 0; i--)
			newstaff.addLast(staff.get(i));
		
		staff = newstaff;
		
		System.out.print(staff.toString());
	}

}
