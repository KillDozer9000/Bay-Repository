package p19;

public class SelectionSort
{
    public static void sort(int[] x)
    {
//        for(int i = 0; i < x.length-1; i++)
//        {
//        	int mininx = i;
//        	
//        	for(int j = i+1; j < x.length; j++)
//        		if(x[j] < x[mininx])
//        			mininx = j;
//        	
//        	swap(x, mininx, i);
//        }
    	sort(x, 0);
    	//indexOfMin(x, 0);
    }
    
    private static void swap(int[] x, int i, int j)
    {
    	int temp = x[i];
    	x[i] = x[j];
    	x[j] = temp;
    }
    
    // recursive variant sorts x[start] ... x[x.length - 1]
    //[2 3 4 6 5]
    private static void sort(int[] x, int start)
    {
        if(start == x.length || x.length <= 1)
        	return;
        
        swap(x, indexOfMin(x, start), start);
        sort(x, start+1);
    }
    
    private static int indexOfMin(int[] x, int start)
    {	
    	if(start == x.length-1 || x.length <= 1)
    		return start;
    	
    	int mininx = indexOfMin(x, start+1);
    	
    	if(x[start] < x[mininx])
    		return start;
    	
    	return mininx;
    }
}