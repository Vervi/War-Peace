import java.util.*;


public class Deck {

	private int deckSize=52;
		private Card[] deck= new Card [deckSize];
		private Card top;
		
		private int topCard=0;
		
public Deck() {
		
			//fill deck with card objects
			topCard =0;
			int count = 0;
			for(CardValue v: CardValue.values())
			{	
				for(CardSuit s: CardSuit.values())
				{
					deck[count]= new Card(v,s);
					count++;
				}
			}
				List<Card> list = Arrays.asList(deck);
				Collections.shuffle(list);
				//https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html#shuffle
			
		}
 
}


public Card draw() {
	
	
		if(topCard < deckSize)
		{
			return deck [topCard++];
		}
		else
			System.out.println("oops, i think the deck is empty...");
			return null;

	}
		
}
