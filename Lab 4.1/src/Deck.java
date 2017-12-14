import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for(int x = 0; x < ranks.length; x++)
		{
			for(int y = 0; y < suits.length; y++)
			{
				for(int z = 0; z < values.length; z++)
				{
					Card card1 = new Card(ranks[x],suits[y],values[z]);
					unDealt.add(card1);
					
				}
			}		
		}
	}
	
	public static boolean isEmpty(ArrayList<Card> cards)
	{
		if(cards.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public static int size(ArrayList<Card> cards)
	{
		return cards.size();
	}
	
	public Card deal(ArrayList<Card> cards)
	{
		if(!isEmpty(cards))
		{
			Card x = cards.get((int) Math.random() * cards.size());
			Dealt.add(x);
			int y = Dealt.indexOf(x);
			return Dealt.get(y);
		}
		
		return null;
	}

}
