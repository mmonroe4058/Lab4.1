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
	
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return unDealt.size();
	}
	
	public Card deal()
	{
		if(!isEmpty())
		{
			Card x = unDealt.get((int) Math.random() * this.size());
			Dealt.add(x);
			return x;
		}
		
		return null;
	}
	
	public void shuffle()
	{
		int k = 0;
		int r = 0;
		
		for(int i = 0; i < Dealt.size(); i++)
		{
			unDealt.add(i, Dealt.get(i));
			Dealt.remove(i);
		}
		while(k > 1)
		{
			r = ((int)Math.random()*51);
			Card temp1 = Dealt.get(k);
			Card temp2 = Dealt.get(r);
			Dealt.set(k, temp2);
			Dealt.set(r, temp1);
			k--;
		}
	}

}
