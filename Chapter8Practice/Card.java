

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name;

    /**
     * Default constructor for objects of class Card
     */
    public Card()
    {
        name = "";
    }
    
    public Card(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
    
    public boolean isExpired()
    {
        return false;
    }
    
    public String format()
    {
        return "Card holder: " + name;
    }
    
    public String toString()
    {
        String str = "Card";
        str += "[name =" + name + "]";
        
        return str;
    }
    
    public boolean equals(Object otherObject)
    {
       if(this.getClass() == otherObject.getClass())
        {          
            Card other = (Card) otherObject;
            return this.name.equals(other.name);
            
        }
       return false;
    }
    
   

}
