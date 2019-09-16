package p3;

public class LetterTester 
{
	public static void main(String[] args)
	{
	
		Letter let = new Letter("Jim", "Bill"); //to, from
		let.addLine("asdlkjfasldkfja");
		let.addLine("asldkjlaksjdflkajsdflaksjdf");
		let.addLine("djfalskdjf);laskdjf;laskjdf;lk");
		let.addLine("asdddddddddddddddddddddddddd");
		let.getText();
		let.LetterPrinter();
	}
	
}
