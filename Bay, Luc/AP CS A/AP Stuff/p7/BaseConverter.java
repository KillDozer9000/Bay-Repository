package p7;

import java.util.ArrayList;

public class BaseConverter
{
    static char digitToChar(int digit)
    {	
    	if(digit < 10)
    		return (char)(digit+'0');
    	else
    		return (char)((digit-10)+'A');
    }
    
    public static String convertFromBase10(int num, int targetBase)
    {
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	String end = "";
    	
    	for(;num > 0; num/=targetBase)
    		nums.add(num%targetBase);
    	
    	for(int i=nums.size()-1; i >= 0; i--)
    	{
    		int n = nums.get(i);
    		
    		if(n > 9)
    			end += (char)((n-10)+'A');
    		else
    			end += n;
    	}
    		
        return end;
    }

    static int charToValue(char digit)
    {
    	int num = (int)(digit-'0');
    	if(num < 10)
    		return num;
    	else
    		return (int)(digit-'A'+10);
    }
    
    public static int convertToBase10(String num, int originalBase)
    {
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	int end = 0;
    	
    	for(int i=0; i<num.length();i++)
    		nums.add(charToValue(num.charAt(i)));
    	
    	for(int i=nums.size()-1, c=0; i>=0; i--,c++)
    		end += (int) (nums.get(i)*Math.pow(originalBase,c));
    	
        return end;
    }

    public static String convert(String num, int originalBase, int targetBase)
    {
        return convertFromBase10(convertToBase10(num, originalBase), targetBase);
    }
}
