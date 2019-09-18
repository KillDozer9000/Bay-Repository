package SOWJCode;

import java.util.Arrays;

//Write a method that generates an array with the specified number of random values in a specified range. Test the method.

public class Chp7Random 
{
	public static void random(int length, int lowest, int highest)
	{
		int[] array = new int[length];
		for(int counter = 0; counter < array.length; counter++)
		{
			array[counter] = (int) (Math.random() * (highest-lowest)+lowest);
		}
		System.out.print(Arrays.toString(array));
	}
	public static void main(String[] args)
	{
		random(4, 5, 15);
	}
}
