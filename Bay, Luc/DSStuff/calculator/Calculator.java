package calculator;

import java.util.Stack;
import java.lang.Math;

public class Calculator 
{
	static Stack<Double> nums = new Stack<Double>();
	static Stack<String> ops = new Stack<String>();
	static String exp = "2 * ( 13 - ( 1 + 6 ) )";		// Enter expression here-----------
	
	public static void main(String[] args) throws Exception 
	{
		String elem = "";
		
		for(int i=0; i<exp.length(); i++)
		{
			if(exp.charAt(i) == ' ') 							// element is complete
			{
				parse(elem); 									// perform according operation on element
				elem = "";										//reset string for next element
			}
			else												// element is not complete, continue adding
				elem += exp.charAt(i);
		}
		
		parse(elem);											// perform operation on last element
		while(!ops.isEmpty())									// take care of remaining expression
			operate();
		
		System.out.println("Expression: "+exp);
		System.out.println("Answer: "+nums.pop());
	}
	
	public static void parse(String elem) throws Exception
	{
		if(isNumber(elem)) 										// element is #, push to stack
			nums.push(Double.parseDouble(elem));
		else													// element is a sign
		{
			if(elem.equals(")"))								// element is a )
			{
					while(!ops.lastElement().equals("("))		// operate until ( found on stack
						operate();
					ops.pop();									// remove ( from stack
			}
			else if(checkprec(elem))							// element has higher prec, push to stack
				ops.push(elem);
			else												// element has lower prec
			{
				while(!checkprec(elem))							// operate until lower prec then push to stack
					operate();
				ops.push(elem);
			}
		}
	}
	
	public static boolean isNumber(String elem)					// Returns if the given string contains only numbers
	{
	    try{double x = Double.parseDouble(elem);}
	    		
	    catch (NumberFormatException | NullPointerException nfe){return false;}

	    return true;
	}
	
	public static boolean checkprec(String s1)					// Returns whether given sign has prec over the sign at the top of the stack
	{
		if(ops.empty())											// Automatically has prec if 1st sign
			return true;
		
		String s2 = ops.lastElement();
		int n1 = 0, n2 = 0;
		
		switch (s1)
		{
			case "+" : case "-" : n1 = 1; break;
			case "/" : case "*" : n1 = 2; break;
			case "^" : n1 = 3; break;
			case ")" : case "(" : n1 = 4; break;
		}
		
		switch (s2)
		{
			case "(" : n2 = 0; break;
			case "+" : case "-" : n2 = 1; break;
			case "/" : case "*" : n2 = 2; break;
			case "^" : n2 = 3; break;
			case ")" : n2 = 4; break;
		}
		
		return n1 > n2;
	}
	
	public static void operate() throws Exception				// Does the actual math
	{
		String op = ops.pop();
		Double n1 = nums.pop(), n2 = nums.pop();
		
		if(op.equals("/") && n1 == 0)
			throw new Exception("You can't / by 0 IDIOT");
	
		switch (op)
		{
		case "+" : n2 += n1; break;
		case "-" : n2 -= n1; break;
		case "*" : n2 *= n1; break;
		case "/" : n2 /= n1; break;
		case "^" : n2 = Math.pow(n2, n1); break;
		}
	
		nums.push(n2);
	}

}
