import java.util.*;
/**
 * Blueprint for a Deck of Cards
 * 
 * @Members
 * 			<li> Card [] deck </li>
 * 			<li> int deckSize </li>
 * 			<li> int topCard </li>
 * 			
 */
public class Deck {

	private int deckSize=52;
	private Card[] deck= new Card [deckSize];
	private int topCard=0;

/**
 * Constructor: takes no parameters. Fills a Card array with Card objects and shuffles them.		
 */
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
			}

/**
 * Method: Deals the next card
 * @return Card object
 */
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
