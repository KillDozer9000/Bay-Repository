package p2;

public class P2_9 
{
	public static void main(String[] args)
	{
		String word = "Mississippi";
		String ireplace = word.replace('i', '!');
		String sreplace = ireplace.replace('s', '$');
		System.out.println(sreplace);
	}
}