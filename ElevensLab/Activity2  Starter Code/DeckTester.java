/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] deck1Ranks = {"A", "B", "C", "D", "E"};
        String[] deck1Suits =  {"Giraffes"};
        int[] deck1Values = {1, 2, 3, 4, 5};
        String[] deck2Ranks = {"1", "2", "3"};
        String[] deck2Suits =  {"Turtles"};
        int[] deck2Values = {6, 7, 8};
        String[] deck3Ranks = {"One", "Two", "Three", "Four"};
        String[] deck3Suits =  {"Cats", "Dogs"};
        int[] deck3Values = {1, 2, 3, 4};
        
        
        Deck deck1 = new Deck(deck1Ranks, deck1Suits, deck1Values);
        Deck deck2 = new Deck(deck2Ranks, deck2Suits, deck2Values);
        Deck deck3 = new Deck(deck3Ranks, deck3Suits, deck3Values);
        
        //testing Deck methods
        System.out.println("\n" + deck1.toString() );
        System.out.println("\n" + deck2.toString() );
        System.out.println("\n" + deck3.toString() );
        
        System.out.println(deck1.isEmpty() );
        System.out.println(deck2.isEmpty() );
        System.out.println(deck3.isEmpty() );
        
        System.out.println(deck1.size() );
        System.out.println(deck2.size() );
        System.out.println(deck3.size() );
        
        System.out.println(deck1.deal() );
        System.out.println(deck2.deal() );
        System.out.println(deck3.deal() );
        

        
    }
}
