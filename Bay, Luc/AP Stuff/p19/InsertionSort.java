package p19;

public class InsertionSort
{
//	public static void main(String[] args) 
//	{
//		int[] x = {1, 2, 4, 5, 6};
//		int key = 2;
//		
//		System.out.print(binarySearch(x, key));
//	}
    public static void sort(int[] x)
    {
//        for(int i = 1; i < x.length; i++)
//        {
//        	int temp = x[i];
//      
//        	int j = i-1;
//        	while(j > -1 && temp < x[j])
//        	{	
//        		x[j+1] = x[j];
//        		j--;
//        	}
//        	
//        	x[j+1] = temp;
//        }
    	sortWithBinarySearch(x);
    }
    
    public static void recursiveSort(int[] x)
    {
        
    }

    public static void sortWithBinarySearch(int[] x)
    {
        for(int i = 1; i < x.length; i++)
        {
        	int temp = x[i];
        	
        	int inx = binarySearch(x, temp, 0, i+1);
        	
        	if(inx != -1)
        	{
        		x[i] = x[inx];
        		x[inx] = temp;
        		
        	}
        }
    }

    public static int binarySearch(int[] x, int key)
    {
    	return binarySearch(x, key, 0, x.length-1);
    }

    private static int binarySearch(int[] x, int key, int start, int end)
    {
        if(start > end)
        	return -start+1 -1;
        
        int mid = (start+end)/2;
        
        if(x[mid] == key)
        	return mid;
        else if(x[mid] < key)
        	return binarySearch(x, key, mid+1, end);
        else
        	return binarySearch(x, key, start, mid-1);
    }

    // recursive variant sorts x[start] ... x[x.length - 1]
    private static void sort(int[] x, int start)
    {
        
    }

    // inserts value into correct position in x[0]...x[start]
    private static void insert(int[] x, int value, int start)
    {
        
    }
}
