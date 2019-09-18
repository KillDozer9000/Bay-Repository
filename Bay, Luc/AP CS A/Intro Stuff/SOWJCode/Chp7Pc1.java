package SOWJCode;

public class Chp7Pc1
{
	public static void main(String[] args) 
	{
		int[] rain = {1, 2, 4, 2, 1, 3, 1, 11, 3, 1, 7, 2};
		int total = 0;
		int average = 0;
		int biggest = rain[0];
		int smallest = rain[0];
		
		for (int counter = 1; counter < rain.length; counter++) 
		{
			total += rain[counter];
			biggest = Math.max(biggest, rain[counter]);
			smallest = Math.min(smallest, rain[counter]);
		}
		average = total / 12;
		System.out.println("Total: "+ total);
		System.out.println("Average: "+ average);
		System.out.println("Biggest: "+ biggest);
		System.out.println("Smallest: "+ smallest);
	}

}
