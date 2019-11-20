package p21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studentMap 
{
	static Map<String, String> map1 = new HashMap<>();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		boolean end = false;
		while(!end)
		{
			System.out.println("\n1 : add students \n2 : remove students \n3 : change grades \n4 : see all students \n5 : end");
			int input = in.nextInt();
		
			switch(input)
			{
			case 1: add(); break;
			case 2: remove(); break;
			case 3: change(); break;
			case 4: print(); break;
			case 5: end = true; break;
			}
		}
		System.out.println("Done");
	}
	
	public static void add()
	{
		in.nextLine();
		System.out.print("\nInsert student name: ");
		String name = in.nextLine();
		System.out.print("Insert student grade: ");
		String grade = in.nextLine();
		
		map1.put(name, grade);
	}
	
	public static void remove()
	{
		in.nextLine();
		System.out.print("\nInsert student to remove: ");
		String name = in.nextLine();
		
		map1.remove(name);
	}
	
	public static void change()
	{
		in.nextLine();
		System.out.print("\nInsert student to change: ");
		String name = in.nextLine();
		System.out.print("Insert new grade: ");
		String grade = in.nextLine();
		
		map1.replace(name, grade);
	}
	
	public static void print()
	{	
		System.out.println();
		for (Map.Entry<String, String> entry : map1.entrySet()) 
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}

}
