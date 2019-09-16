package p19;

import java.util.Arrays;

import junit.framework.TestCase;

public class SelectionSortTest extends TestCase
{
    public void testSelectionSort()
    {
        int arrayLength = (int) (Math.random() * 19) + 2;
        
        int[] vals = new int[arrayLength];
        
        for(int i = 0; i < vals.length; i++)
            vals[i] = (int) (Math.random() * 201) - 100;
        
        int[] valsCopy = vals.clone();
        
        SelectionSort.sort(vals);
        Arrays.sort(valsCopy);
        
        assertTrue(Arrays.equals(vals, valsCopy));
    }
    
    public void testOnEmptyArray()
    {
        int[] vals = new int[0];
        SelectionSort.sort(vals); // must not crash
    }
    
    public void testOnArrayOfLengthOne()
    {
        int[] vals = {5};
        SelectionSort.sort(vals);
        
        assertTrue(Arrays.equals(vals, new int[]{5}));
    }
}