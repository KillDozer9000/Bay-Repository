package p3;

public class Letter 
{

	private String from;
	private String to;
	private String letter = "";
	private String body;
	
	public Letter (String fro, String t)
	{
		from = fro;
		to = t;
	}
	
	public void addLine(String line)
	{
		body += line +".\n";
	}
	
	public String getText()
	{
		letter += "Dear "+ to+": \n";
		letter += body;
		letter += "Sincerely, \n"+ from;
		return letter;
	}
	
	public void LetterPrinter()
	{
		System.out.println(letter);
	}
	
	
	
}
