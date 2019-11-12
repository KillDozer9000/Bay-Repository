package calculator;

import java.util.Stack;

public class Calculator 
{
	static Stack<Double> nums;
	static Stack<Character> ops;
	static String exp;
	
	public static void enter()
	{
		for(int i=0; i<exp.length(); i++)
		{
			char temp = exp.charAt(i);

			if(Character.isDigit(temp))
				nums.push((double) Character.getNumericValue(temp));
			else if(temp != ' ')
				ops.push(temp);
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		exp = "1 + 2";
		nums = new Stack<Double>();
		ops = new Stack<Character>();
		
		enter();
		int x = 0;
	}
	
	public static boolean checksign(char s1, char s2)
	{
		
		return false;
	}

}
