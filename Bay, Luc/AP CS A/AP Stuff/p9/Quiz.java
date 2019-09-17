package p9;

public class Quiz implements Measurable
{
	private int score;
	private String letter;
	
	public Quiz(int score, String letter)
	{
		this.score = score;
		this.letter = letter;
	}
	
	public double getMeasure()
	{
		return score;
	}
}
