package p5;

public class Card 
{
	private String card;
	
	public Card(String card)
	{
		this.card = card;
	}
	
	public String getDescription()
	{
		if(card.length() <= 3)
		{
			String des = "";
			switch(card.substring(0,1))
			{
				case "A": des+="Ace of"; break;
				case "2": des+="Two of"; break;
				case "3": des+="Three of"; break;
				case "4": des+="Four of"; break;
				case "5": des+="Five of"; break;
				case "6": des+="Six of"; break;
				case "7": des+="Seven of"; break;
				case "8": des+="Eight of"; break;
				case "9": des+="Nine of"; break;
				case "1": des+="Ten of"; break;
				case "J": des+="Jack of"; break;
				case "Q": des+="Queen of"; break;
				case "K": des+="King of"; break;
			}
			switch(card.substring(1))
			{
				case "D": des+=" Diamonds"; break;
				case "H": des+=" Hearts"; break;
				case "S": des+=" Spades"; break;
				case "C": des+=" Clubs"; break;
			}
			return des;
		}
		else
			return "Not valid format";
	}
	public void write()
	{
		System.out.println(this);
	}
}
