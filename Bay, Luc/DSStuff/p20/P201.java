package p20;

import java.util.LinkedList;

public class P201 
{
	public static void main(String[] args) 
	{
		LinkedList<String> emp = new LinkedList<String>();
		emp.add("one");
		emp.add("two");
		emp.add("three");
		emp.add("four");
		
		downsize(emp);
	}
	
	public static void downsize(LinkedList<String> staff)
	{
		for(int i=0; i<staff.size(); i++)
			staff.remove(i);
		
		System.out.print(staff.toString());
	}
}
