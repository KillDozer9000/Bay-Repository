package p7;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ArrayListPracticeTest extends TestCase
{
    public void testRemoveWordSimple()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("the");
        words.add("happy");
        words.add("cat");
        words.add("ate");
        words.add("the");
        words.add("unhappy");
        words.add("rat");
        
        String wordToRemove = "the";
        
        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("happy");
        expectedResult.add("cat");
        expectedResult.add("ate");
        expectedResult.add("unhappy");
        expectedResult.add("rat");
        
        ArrayListPractice.removeWord(words, wordToRemove);
        
        assertTrue(words.equals(expectedResult));
    }

    public void testRemoveWordAdjacent()
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("a");
        words.add("blue");
        words.add("blue");
        words.add("blue");
        words.add("bird");
        words.add("ate");
        words.add("a");
        words.add("blue");
        words.add("blue");
        words.add("worm");
        words.add("too");
        words.add("much");
        words.add("blue");
        
        String wordToRemove = "blue";
        
        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("a");
        expectedResult.add("bird");
        expectedResult.add("ate");
        expectedResult.add("a");
        expectedResult.add("worm");
        expectedResult.add("too");
        expectedResult.add("much");
        
        ArrayListPractice.removeWord(words, wordToRemove);
        
        assertTrue(words.equals(expectedResult));
    }

    public void testDuplicateMatching()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(5);
        list.add(7);
        
        Integer elementToDuplicate = new Integer(7);
        
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(7);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(7);
        expectedResult.add(7);
        expectedResult.add(7);
        expectedResult.add(9);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(7);
        
        ArrayListPractice.duplicateMatching(list, elementToDuplicate);
        
        assertTrue(list.equals(expectedResult));
    }
    
    public void testRemoveAdjacentDuplicates()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(5);
        expectedResult.add(3);
        expectedResult.add(7);
        expectedResult.add(8);
        expectedResult.add(7);
        
        ArrayListPractice.removeAdjacentDuplicates(list);
        
        assertTrue(list.equals(expectedResult));
    }
    
    public void testRemoveAdjacentDuplicatesSmall()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        
        ArrayListPractice.removeAdjacentDuplicates(list);
        
        assertTrue(list.equals(expectedResult));
        
        
        list = new ArrayList<Integer>();
        list.add(5);
        
        expectedResult = new ArrayList<Integer>();
        expectedResult.add(5);
        
        ArrayListPractice.removeAdjacentDuplicates(list);
        
        assertTrue(list.equals(expectedResult));
    }
    
    // TODO: test remove dups with lists of size 0 and 1
}