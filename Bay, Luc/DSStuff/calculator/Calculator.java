package calculator;

import java.util.Stack;
import java.lang.Math;

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
			{
				if(checksign(temp))
					ops.push(temp);
				else
					while(!ops.isEmpty())
						operate();
			}
				
		}
	}
	
	
	public static void main(String[] args) 
	{
		exp = "1 + 2 + 3";
		nums = new Stack<Double>();
		ops = new Stack<Character>();
		
		enter();
		int x = 0;
	}
	
	public static boolean checksign(char s1)
	{
		if(ops.empty())
			return true;
		
		char s2 = ops.lastElement();
		int n1 = 0, n2 = 0;
		
		switch (s1)
		{
			case '+' : case '-' : n1 = 1;
				break;
			case '/' : case '*' : n1 = 2;
				break;
			case '^' : n1 = 3; 
				break;
		}
		
		switch (s2)
		{
			case '+' : case '-' : n2 = 1;
				break;
			case '/' : case '*' : n2 = 2;
				break;
			case '^' : n2 = 3;
				break;
		}
		
		return n1 >= n2;
	}
	
	public static void operate()
	{
		char op = ops.pop();
		Double n1 = nums.pop();
		Double n2 = nums.pop();
	
		switch (op)
		{
		case '+' : n1 += n2; break;
		case '-' : n1 -= n2; break;
		case '*' : n1 *= n2; break;
		case '/' : n1 /= n2; break;
		case '^' : n1 = Math.pow(n1, n2); break;
		}
	
		nums.push(n1);
		
		/*char op = ops.pop();
		
		while(checksign(op) && !ops.isEmpty())
		{
			Double n1 = nums.pop();
			Double n2 = nums.pop();
		
			switch (op)
			{
			case '+' : n1 += n2; break;
			case '-' : n1 -= n2; break;
			case '*' : n1 *= n2; break;
			case '/' : n1 /= n2; break;
			case '^' : n1 = Math.pow(n1, n2); break;
			}
		
			nums.push(n1);
			//if(!ops.isEmpty())
				op = ops.pop();
		}*/
	}

}
