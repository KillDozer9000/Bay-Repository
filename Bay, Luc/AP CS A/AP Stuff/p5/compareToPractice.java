package p5;

import java.util.Arrays;

public class compareToPractice
{

    public static void main(String[] args)
    {
        String strA = "Brandon";
        String strB = "Horn";
        
        // write code to determine which string comes first
        // test with all 3 options (strA comes first, strB comes first, strA and strB are equal)
        if(strA.compareTo(strB) > 0)
        	System.out.println(strA);
        else if(strA.compareTo(strB) == 0)
        	System.out.println("Equal");
        else
        	System.out.println(strB);
        
        
        Integer intA = new Integer(10);
        Integer intB = new Integer(5);
        
        // write code to determine which Integer object comes first
        // test with all 3 options
        if(intA.compareTo(intB) > 0)
        	System.out.println(intA);
        else if(intA.compareTo(intB) == 0)
        	System.out.println("Equal");
        else
        	System.out.println(intB);
        
        
        Double doubleA = new Double(5.2);
        Double doubleB = new Double(7.3);
        
        // write code to determine which Double object comes first
        // test with all 3 options
        if(doubleA.compareTo(doubleB) > 0)
        	System.out.println(doubleA);
        else if(doubleA.compareTo(doubleB) == 0)
        	System.out.println("Equal");
        else
        	System.out.println(doubleB);
        
        
        // implement the compareTo method in the Student class
        // do not modify the code below
        
        Student[] students = new Student[4];
        students[0] = new Student("Brandon", "Horn", 3.7);
        students[1] = new Student("Gregg", "Smith", 4.0);
        students[2] = new Student("Paul", "Hamnett", 3.6);
        students[3] = new Student("Dennis", "Lepold", 3.6);
        
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
  
        for(int i=0; i < 3; i++)
        {
        	if((students[i].compareTo(students[i+1]) > 0))
        		System.out.println(students[i].toString());
        	else if(students[i].compareTo(students[i+1]) == 0)
        		System.out.println("Equal");
        	else
        		System.out.println(students[i+1].toString());
        }
    }

}