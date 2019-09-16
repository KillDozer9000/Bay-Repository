package p19;

import java.util.Arrays;

import junit.framework.TestCase;

public class MergeSortTest extends TestCase
{
    public void testMergeOnEntireArray()
    {
        int[] arr = {36, 71, 78, 79, 86, 11, 24, 35, 75, 86};
        //            0   1   2   3   4   5   6   7   8   9
        
        int low = 0, mid = 4, high = 9;
        
        MergeSort.merge(arr, low, mid, high);
        
        int[] expectedResult = {11, 24, 35, 36, 71, 75, 78, 79, 86, 86};
        
        assertTrue(Arrays.equals(arr, expectedResult));
    }
    
    public void testMergeOnPartOfArray()
    {
        int[] arr = {36, 71, 78, 79, 86, 11, 24, 35, 75, 86};
        //            0   1   2   3   4   5   6   7   8   9
        
        int low = 3, mid = 4, high = 6;
        
        MergeSort.merge(arr, low, mid, high);
        
        int[] expectedResult = {36, 71, 78, 11, 24, 79, 86, 35, 75, 86};
        //                       0   1   2   3   4   5   6   7   8   9
        
        assertTrue(Arrays.equals(arr, expectedResult));
    }
    
    public void testMergeSort()
    {
        int arrayLength = (int) (Math.random() * 19) + 2;
        
        int[] vals = new int[arrayLength];
        
        for(int i = 0; i < vals.length; i++)
            vals[i] = (int) (Math.random() * 201) - 100;
        
        int[] valsCopy = vals.clone();
        
        MergeSort.sort(vals);
        Arrays.sort(valsCopy);
        
        assertTrue(Arrays.equals(vals, valsCopy));
    }
    
    public void testOnEmptyArray()
    {
        int[] vals = new int[0];
        MergeSort.sort(vals); // must not crash
    }
    
    public void testOnArrayOfLengthOne()
    {
        int[] vals = {5};
        MergeSort.sort(vals);
        
        assertTrue(Arrays.equals(vals, new int[]{5}));
    }
}