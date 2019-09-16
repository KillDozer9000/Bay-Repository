package SOWJCode;

import java.util.Arrays;

//The variables numberArrayl and numberArray2 reference arrays that each have 100 elements.
//Write code that copies the values in numberArrayl to numberArray2. 

public class Chp7Aw2 
{
	public static void main(String[] args)
	{
		int [] numberArray2 = new int[100];
		int [] numberArray1 = new int[100];
		
		for(int counter = 0; counter < numberArray1.length; counter++)//this just gives array1 a value for testing
			numberArray1[counter] = 11;
		
		numberArray2 = numberArray1;
		
		System.out.println(Arrays.toString(numberArray2));
	}
}
