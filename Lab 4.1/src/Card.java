
public class Card {

	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card othercard)
	{
		if(this.pointValue == othercard.pointValue)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return "{ " + this.getRank() + " " + this.getSuit() + " " + this.getPointValue() + " }";
	}

	public String getRank()
	{
		return this.rank;
	}

	public String getSuit()
	{
		return this.suit;
	}
	
	public int getPointValue()
	{
		return this.pointValue;
	}

}
