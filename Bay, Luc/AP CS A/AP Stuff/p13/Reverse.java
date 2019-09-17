package p13;

public class Reverse 
{
	public static String reverse(String str)
	{
		return reverse(str, 0, str.length()-1);
	}
	
	public static String reverse(String str, int start, int end)
	{
		if(str.length() == 0)
			return "";
		
		return str.charAt(end) + reverse(str.substring(start, end));
	}
	
	public static void main(String[] args) 
	{
		System.out.print(reverse("Hello!"));
	}

}
