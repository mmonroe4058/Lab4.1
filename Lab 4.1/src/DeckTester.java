import java.util.ArrayList;

public class DeckTester
{
	public static void main(String[] args)
	{		
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2,1,6};
		
		Deck deck1 = new Deck(ranks, suits, values);
		
		for(Card x : deck1.getUndealt())
		{
		    System.out.print(x.toString());
		}
		
		System.out.println(" ");
		
		deck1.shuffle();
		
		for(int i = 0; i < deck1.size(); i++)
		{
		   System.out.print(deck1.deal());
		}
		
		System.out.println(deck1.size());
	}
	
}
