/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card card1 = new Card("4", "Clubs", 4);
		Card card2 = new Card("4", "Spades", 4);
		Card card3 = new Card("K", "Hearts", 13);
		Card card4 = new Card("K", "Hearts", 13);
		
		System.out.println(card1.toString() + card2.toString() + card3.toString() + card4.toString());
		System.out.println(card3.matches(card4));
		System.out.println(card1.matches(card2));
	}
}
