
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
        return super.format() + "\n" + cardNum + "\n" + pin;
    }
    
    public String toString()
    {
        String str = "CallingCard[";
        str += "name=" + super.getName() + "]";
        str += "[number =" + cardNum + "]";
        str += "[pin =" + pin + "]";
        
        return str;
        
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {          
            CallingCard other = (CallingCard) otherObject;
            return this.getName().equals(other.getName())
                && this.cardNum.equals(other.cardNum)
                && this.pin.equals(other.pin);
            
        }
       return false;
    }

    

}
