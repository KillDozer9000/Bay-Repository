package p19;

public class MergeSort
{
	public static void sort(int[] a)
	{
		sort(a, 0, a.length);
	}
	
	static void sort(int[] a, int low, int high)
	{
		if(low == high || a.length <= 1)
			return;
		
		int mid = (low+high)/2;
		
		sort(a, low, mid);
		sort(a, mid+1, high);
		
		merge(a, low, mid, high);
	}
	//merges two sorted halves
	static void merge(int[] a, int low, int mid, int high)
	{
		int[] temp = new int[high-low];
	    int finx = low;
	    int linx = mid+1;
	    
	    for(int i=0; i<temp.length; i++)
	    {
	    	if(a[finx] < a[linx])
	    	{
	    		temp[i] = a[finx];
	    		finx++;
	    	}
	    	
	    	else
	    	{
	    		temp[i] = a[linx];
	    		linx++;
	    	}
	    }
	    
	    
	}
}
