package p13;

public class Find 
{
	public static boolean find(String str, String src)
	{
		if(src.length() <= str.length())
			return false;
		if(str.equals(src.substring(0, str.length())))
			return true;

		
		return find(str, src.substring(1, src.length()));
	}
	public static void main(String[] args) 
	{
		String str = "string";
		System.out.println(str.substring(0, str.length()));
		System.out.print(find("sip", "missippi"));
	}

}
