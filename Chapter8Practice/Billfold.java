
public class Billfold
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold(Card card1, Card card2)
    {
        this.card1 = card1;
        this.card2 = card2;
    }

    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
     }
    
    public String formatCards()
    {
        String cards = "";
        if(card1 != null)
        {
            cards += card1.format() + "\n";
        }
        
        if(card2 != null)
        {
            cards += card2.format();
        }
        
        return cards;
    }
    
    public int getExpiredCardCount()
    {
        int expiredCards = 0;
        if(card1.isExpired())
        {
            expiredCards++;
        }
        if(card2.isExpired())
        {
            expiredCards++;
        }
        return expiredCards;
    }

}
