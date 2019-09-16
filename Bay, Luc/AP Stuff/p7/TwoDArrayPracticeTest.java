package p7;

import java.util.Arrays;

import junit.framework.TestCase;

public class TwoDArrayPracticeTest extends TestCase
{
    private static boolean arraysEqual(int[][] one, int[][] two)
    {
        if(one.length != two.length)
            return false;
        
        for(int r = 0; r < one.length; r++)
            if( ! Arrays.equals(one[r], two[r]) )
                return false;
        
        return true;
    }
    
    private static boolean arraysEqual(String[][] one, String[][] two)
    {
        if(one.length != two.length)
            return false;
        
        for(int r = 0; r < one.length; r++)
            if( ! Arrays.equals(one[r], two[r]) )
                return false;
        
        return true;
    }
    
    public void testRowSwap()
    {
        int[][] mat = new int[][]{
            {10, 9, 8, 7},
            {6, 5, 4, 3},
            {2, 1, -1, 0}
        };
        
        int[][] expectedResult = new int[][]{
            {10, 9, 8, 7},
            {2, 1, -1, 0},
            {6, 5, 4, 3}
        };
        
        int rowAIndex = 1, rowBIndex = 2;
        
        TwoDArrayPractice.rowSwap(mat, rowAIndex, rowBIndex);
        
        assertTrue(arraysEqual(mat, expectedResult));
    }
    
    public void testColSwap()
    {
        int[][] mat = new int[][]{
            {10, 9, 8, 7},
            {6, 5, 4, 3},
            {2, 1, -1, 0}
        };
        
        int[][] expectedResult = new int[][]{
            {10, 7, 8, 9},
            {6, 3, 4, 5},
            {2, 0, -1, 1}
        };
        
        int colAIndex = 1, colBIndex = 3;
        
        TwoDArrayPractice.colSwap(mat, colAIndex, colBIndex);
        
        assertTrue(arraysEqual(mat, expectedResult));
    }

    public void testFillRowMajorExact()
    {
        String phrase = "stop whining";
        
        int numRows = 3, numCols = 4;
        
        String[][] expectedResult = {
                {"s", "t", "o", "p"},
                {" ", "w", "h", "i"},
                {"n", "i", "n", "g"}
        };
        
        String[][] actualResult = TwoDArrayPractice.fillRowMajor(phrase, numRows, numCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
    
    public void testFillRowMajorTooMany()
    {
        String phrase = "stop complaining";
        
        int numRows = 3, numCols = 4;
        
        String[][] expectedResult = {
                {"s", "t", "o", "p"},
                {" ", "c", "o", "m"},
                {"p", "l", "a", "i"}
        };
        
        String[][] actualResult = TwoDArrayPractice.fillRowMajor(phrase, numRows, numCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
    
    public void testFillRowMajorTooFew()
    {
        String phrase = "do more";
        
        int numRows = 3, numCols = 4;
        
        String[][] expectedResult = {
                {"d", "o", " ", "m"},
                {"o", "r", "e", null},
                {null, null, null, null}
        };
        
        String[][] actualResult = TwoDArrayPractice.fillRowMajor(phrase, numRows, numCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }

    public void testFillColumnMajor()
    {
        int[] original = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        
        int numRows = 3, numCols = 4;
        
        int[][] expectedResult = new int[][]{
            {10, 7, 4, 1},
            {9, 6, 3, 0},
            {8, 5, 2, -1}
        };
        
        int[][] actualResult = TwoDArrayPractice.fillColumnMajor(original, numRows, numCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }

    public void testFillDownUp()
    {
        int[] vals = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        int numRows = 3, numCols = 4;
        
        int[][] expectedResult = new int[][] {
            {1, 6, 7, 12},
            {2, 5, 8, 11},
            {3, 4, 9, 10}
        };
        
        int[][] actualResult = TwoDArrayPractice.fillDownUp(vals, numRows, numCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
    
    public void testGrow()
    {
        int[][] original = new int[][]{
            {10, 9, 8, 7},
            {6, 5, 4, 3},
            {2, 1, -1, 0}
        };
        
        int newRows = 4, newCols = 5;
        
        int[][] expectedResult = new int[][] {
            {10, 9, 8, 7, 6},
            {5, 4, 3, 2, 1},
            {-1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        
        int[][] actualResult = TwoDArrayPractice.grow(original, newRows, newCols);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
    
    public void testCrop()
    {
        int[][] original = new int[][]{
            {10, 9, 8, 7},
            {6, 5, 4, 3},
            {2, 1, -1, 0}
        };
        
        int startRow = 0, startCol = 1, endRow = 1, endCol = 2;
        
        int[][] expectedResult = new int[][] {
            {9, 8},
            {5, 4}
        };
        
        int[][] actualResult = TwoDArrayPractice.crop(original,
                startRow, startCol, endRow, endCol);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
    
    public void testInvert()
    {
        int[][] mat = new int[][]{
            {10, 9, 8, 7},
            {6, 5, 4, 3},
            {2, 1, -1, 0}
        };
        
        int[][] expectedResult = new int[][]{
            {10, 6, 2},
            {9, 5, 1},
            {8, 4, -1},
            {7, 3, 0}
        };
        
        int[][] actualResult = TwoDArrayPractice.invert(mat);
        
        assertTrue(arraysEqual(actualResult, expectedResult));
    }
}