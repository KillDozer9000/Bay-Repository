package p19;

public class LinearSearch 
{
	public static int iterative(int vals[], int key)
	{
		for(int i = 0; i<vals.length; i++)
			if(vals[i] == key)
				return i;

		return -1;
	}
	
	public static int recursive(int vals[], int key)
	{
		return recursiveindex(vals, key, 0);
	}
	
	private static int recursiveindex(int vals[], int key, int start)
	{
		if(start >= vals.length)
			return -1;
		
		if(vals[start] == key)
			return start;
		else
		 return recursiveindex(vals, key, start+1);	
	}
	
	public static void main(String[] args)
    {
		int vals[] = {1,2,3,4,5};
		int key = 1;
		
		System.out.print(recursive(vals, key));
    }
}
