package p3;

public class VotingMachine 
{

	private int dvotes;
	private int rvotes;
	
	public VotingMachine()
	{
		clearMachine();
	}
	
	public void clearMachine()
	{
		dvotes = 0;
		rvotes = 0;
	}
	
	public void voteDem()
	{
		dvotes++;
	}
	
	public void voteRep()
	{
		rvotes++;
	}
	
	public int getDem()
	{
		return dvotes;
	}
	
	public int getRep()
	{
		return rvotes;
	}
	
	
	
}
