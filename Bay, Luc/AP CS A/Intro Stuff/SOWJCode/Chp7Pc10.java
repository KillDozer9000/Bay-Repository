package SOWJCode;

public class Chp7Pc10
{
	public static int getotal(int[] array)
	{
		int total = 0;
		for (int counter = 1; counter < array.length; counter++) 
			total += array[counter];
		
		return total;
	}
	
	public static int getaverage(int[] array)
	{
		return getotal(array)/array.length;
	}
	
	public static int getbiggest(int[] array)
	{
		int biggest = array[0];
		for (int counter = 1; counter < array.length; counter++) 
			biggest = Math.max(biggest, array[counter]);
		
		return biggest;
	}
	
	public static int getsmallest(int[] array)
	{
		int smallest = array[0];
		for (int counter = 1; counter < array.length; counter++) 
			smallest = Math.min(smallest, array[counter]);
		
		return smallest;
	}
	
	
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 4, 2, 1, 3, 1, 11, 3, 1, 7, 2};
		System.out.println("total: "+getotal(array));
		System.out.println("average: "+getaverage(array));
		System.out.println("biggest: "+getbiggest(array));
		System.out.print("smallest: "+getsmallest(array));

	}
	
}
