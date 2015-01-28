

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private String cardNum;
    private String pin;
    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard(String n, String cardNum, String pin)
    {
        super(n);
        this.cardNum = cardNum;
        this.pin = pin;
    }
    
    public String format()
    {
        return super.format();
    }

    

}
