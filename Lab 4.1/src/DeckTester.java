
public class DeckTester
{
	public static void main(String[] args)
	{
		//deck1 = new Deck(ranks, suits, values);
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2,1,6};
		
		System.out.println(new Deck(ranks, suits, values));
	
	}
}
