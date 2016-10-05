import java.lang.Enum.*;

/**
 * Blueprint for Card objects.
 */
public class Card {
	
	CardValue value;
	
	CardSuit suit;

	
	/**
	 * Constructor: takes 2 parameters and creates a card object
	 * @param value
	 * @param suit
	 */
public Card(CardValue value, CardSuit suit)
	{
		this.value= value;
		this.suit= suit;
	}

/**
 * Method: returns name of card
 */
public String toString() {
				
		return value + " of " + suit;
		}
	
/**Method: takes a Card as a parameter. compares 2 card objects by both value and suit to
 * determine a winner. Value supercedes suit. In cases where 2 cards of the same value are drawn
 * suits are compared. 
 * 
 * @param Card
 */
public Boolean winner(Card c) {
// this assumes that the game is running uptown in favor of war
		
		
		Boolean win = Boolean.TRUE;
		Boolean loss = Boolean.FALSE;
		Boolean tie= null;
		
		if ((this.value).compareTo(c.value)== 0)	// in case of a tie in numeric value
		{
			if ((this.suit).compareTo(c.suit)== 0) //nobody wins
			{
				
				return tie;
			}
			if ((this.suit).compareTo(c.suit)> 0)
			{
				return win;
			}
			if ((this.suit).compareTo(c.suit) < 0)
			{
				return loss;
			}
			
		}
		else if ((this.value).compareTo(c.value) > 0)
		{
			return win;
		}
	
		else if ((this.value).compareTo(c.value) < 0)
		{
			return loss;
		}
		return tie;
	}

}
