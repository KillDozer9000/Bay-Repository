package p7;

import junit.framework.TestCase;

public class BaseConversionTest extends TestCase
{
    public void testDigitToChar()
    {
        int digit = 0;
        char expectedResult = '0';
        char actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
        
        digit = 5;
        expectedResult = '5';
        actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
        
        digit = 9;
        expectedResult = '9';
        actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
        
        digit = 10;
        expectedResult = 'A';
        actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
        
        digit = 12;
        expectedResult = 'C';
        actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
        
        digit = 15;
        expectedResult = 'F';
        actualResult = BaseConverter.digitToChar(digit);
        assertTrue(actualResult == expectedResult);
    }

    public void testConvertFromBase10()
    {
        int originalNumber = 140;
        int targetBase = 8;
        String expectedResult = "214";
        String actualResult = BaseConverter.convertFromBase10(originalNumber, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = 12;
        targetBase = 2;
        expectedResult = "1100";
        actualResult = BaseConverter.convertFromBase10(originalNumber, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = 13;
        targetBase = 2;
        expectedResult = "1101";
        actualResult = BaseConverter.convertFromBase10(originalNumber, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = 42;
        targetBase = 16;
        expectedResult = "2A";
        actualResult = BaseConverter.convertFromBase10(originalNumber, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = 61;
        targetBase = 16;
        expectedResult = "3D";
        actualResult = BaseConverter.convertFromBase10(originalNumber, targetBase);
        assertTrue(actualResult.equals(expectedResult));
    }

    public void testCharToValue()
    {
        char originalDigit = '0';
        int expectedResult = 0;
        int actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
        
        originalDigit = '5';
        expectedResult = 5;
        actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
        
        originalDigit = '9';
        expectedResult = 9;
        actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
        
        originalDigit = 'A';
        expectedResult = 10;
        actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
        
        originalDigit = 'C';
        expectedResult = 12;
        actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
        
        originalDigit = 'F';
        expectedResult = 15;
        actualResult = BaseConverter.charToValue(originalDigit);
        assertTrue(actualResult == expectedResult);
    }

    public void testConvertToBase10()
    {
        String originalNumber = "3D";
        int originalBase = 16;
        int expectedResult = 61;
        int actualResult = BaseConverter.convertToBase10(originalNumber, originalBase);
        assertTrue(actualResult == expectedResult);
        
        originalNumber = "2A";
        originalBase = 16;
        expectedResult = 42;
        actualResult = BaseConverter.convertToBase10(originalNumber, originalBase);
        assertTrue(actualResult == expectedResult);
        
        originalNumber = "111101";
        originalBase = 2;
        expectedResult = 61;
        actualResult = BaseConverter.convertToBase10(originalNumber, originalBase);
        assertTrue(actualResult == expectedResult);
        
        originalNumber = "214";
        originalBase = 8;
        expectedResult = 140;
        actualResult = BaseConverter.convertToBase10(originalNumber, originalBase);
        assertTrue(actualResult == expectedResult);
    }

    public void testConvert()
    {
        String originalNumber = "111101";
        int originalBase = 2;
        int targetBase = 16;
        String expectedResult = "3D";
        String actualResult = BaseConverter.convert(originalNumber, originalBase, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = "3D";
        originalBase = 16;
        targetBase = 2;
        expectedResult = "111101";
        actualResult = BaseConverter.convert(originalNumber, originalBase, targetBase);
        assertTrue(actualResult.equals(expectedResult));
        
        originalNumber = "157";
        originalBase = 10;
        targetBase = 10;
        expectedResult = "157";
        actualResult = BaseConverter.convert(originalNumber, originalBase, targetBase);
        assertTrue(actualResult.equals(expectedResult));
    }
}