import java.lang.Enum.*;


public class Card {
	
	CardValue value;
	pCardValue value;
	CardSuit suit;
	
	public Card(CardValue value, CardSuit suit)
	{
		this.value= value;
		this.suit= suit;
	
	}
		
	public Card(pCardValue value, CardSuit suit)
	{
		this.value= value;
		this.suit= suit;
	
	}
	
		public String toString() {
				
		return value + " of " + suit;
		}
	

	public Boolean winner(Card c) {
			// this assumes that the game is running uptown (war)
		
		
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
	
	public Boolean pwinner(Card c) {
		// this assumes that the game is running downtown (peace)
	
	
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
			return loss;
		}
		if ((this.suit).compareTo(c.suit) < 0)
		{
			return win;
		}
		
	}
	else if ((this.value).compareTo(c.value) > 0)
	{
		return loss;
	}

	else if ((this.value).compareTo(c.value) < 0)
	{
		return win;
	}
	return tie;
	
	
}
}
