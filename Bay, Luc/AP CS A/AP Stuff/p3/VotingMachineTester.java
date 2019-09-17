package p3;

public class VotingMachineTester 
{
	public static void main(String[] args)
	{
		VotingMachine v1 = new VotingMachine();
		v1.voteDem();
		System.out.println("Democrat votes: "+v1.getDem());
		System.out.println("Republican votes: "+v1.getRep());
		
		v1.clearMachine();
		
		v1.voteRep();
		System.out.println("\nDemocrat votes: "+v1.getDem());
		System.out.println("Republican votes: "+v1.getRep());
	}
}
