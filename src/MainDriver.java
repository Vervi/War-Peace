
import java.util.Scanner;

/**
 * 
 * <p> Peace and War simulates two somewhat simplified versions of the classic card game War. </p>
 * <ul>
 * 	Gameplay:
 * 		<ul>
 * 			<li>Peace: A passive stroll downtown where LOW cards win the game.</li>
 *			 <li>War: An aggressive jog uptown where HIGH cards win the game.</li>
 * 
 * 		</ul>
 * </ul>
 * @author: zhi/N.Willis
 * 
 * @version: 1.0
 * 
 * @see <a href="https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html#shuffle"> Java Algorithms </a>
 * @see <a href ="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html"> Java Enumeration</a>
 * 
 *  
 */
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) 
	
	{
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		int round = 1;
	
		Card p1;
		Card p2;
		Boolean result = null;
		
		
		System.out.println("Would you like to play peace or war?");
		Scanner cin= new Scanner(System.in);
		
		
		String opt =cin.next();
		
		
		
		if(opt.equals("war")|| opt.equals("w"))
		{
			//proceed to play a rousting bout of war
			cin.close();
		
			do
			{	
				p1 = player1.draw();
				p2 = player2.draw();
					
				result = p1.winner(p2);
					if(result == Boolean.TRUE)
					{
						player1Score++;
						System.out.println(p1.toString() + " beats " + p2.toString());
						System.out.println("Player 1 wins round: " + round);
					}
					else if(result == Boolean.FALSE)
					{
						player2Score++;
						System.out.println(p2.toString() + " beats " + p1.toString());
						System.out.println("Player 2 wins round: " + round);
					}
					else if(result == null)
					{
						System.out.println("Round: " + round + " has resulted in a tie");
					}
				
				round++;
				
			}while(round-1 < HANDS);
		
			System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
			System.out.println("");
														if(player1Score > player2Score)                                                                                                              

                                {                                                                                                                                    

                                System.out.println("Player 1 has won this bout of war.");                                                                             

                                }                                                                                                                                    

                                                                                                                                                                     

                        else if(player1Score < player2Score)                                                                
                              {                                                                                                                                    
                              System.out.println("Player 2 has won this bout of war.");                                                                             
                              }                                                                                                                                    
                        else    
                              {                                                                                                                                    
                              System.out.println("It would appear that this bout of War has no victor.");                                                           
                              }	
			
		}
		else if(opt.equals("peace")|| opt.equals("p"))
		{
			//proceed to play a soothing game of peace
			cin.close();
			
			do
			{	
				p1 = player1.draw();
				p2 = player2.draw();
					
				result = p1.winner(p2);
					if(result == Boolean.FALSE)
					{
						player1Score++;
						System.out.println(p1.toString() + " beats " + p2.toString());
						System.out.println("Player 1 wins round: " + round);
					}
					else if(result == Boolean.TRUE)
					{
						player2Score++;
						System.out.println(p2.toString() + " beats " + p1.toString());
						System.out.println("Player 2 wins round: " + round);
					}
					else if(result == null)
					{
						System.out.println("Round: " + round + " has resulted in a tie");
					}
				
				round++;
				
			}while(round-1 < HANDS);
		
			System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
			System.out.println("");
				if(player1Score > player2Score)                                                                                                              

                                {                                                                                                                                    

                                System.out.println("Player 1 has found Peace.");                                                                             

                                }                                                                                                                                    

                                                                                                                                                                     

                        else if(player1Score < player2Score)                                                                
                              {                                                                                                                                    
                              System.out.println("Player 2 has found Peace.");                                                                             
                              }                                                                                                                                    
                        else    
                              {                                                                                                                                    
                              System.out.println("It would appear that the path to Peace is still unclear.");                                                           
                              }	
			
		}
		else
		{
			System.out.println("Uh-oh. I'm having a little trouble understanding your input.");
			System.out.println("Let's try that again.");
		}
		
		
			}
}
