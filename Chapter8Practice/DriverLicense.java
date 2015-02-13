import java.util.Calendar;
import java.util.GregorianCalendar;
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String expYear;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, String expYr)
    {
        super(n);
        this.expYear = expYr;
    }
    
    public String format()
    {
        return super.format() + "\n" + expYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int expYr = Integer.parseInt(expYear);
        if(expYr < calendar.get(Calendar.YEAR))
        {
            return true;
        }
        else
        {
            return super.isExpired();
        }
    }
    
    public String toString()
    {
        String str = "DriverLicense[";
        str += "name=" + this.getName() + "]";
        str += "[expiration =" + expYear + "]";
        
        return str;
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {          
            DriverLicense other = (DriverLicense) otherObject;
            return this.getName().equals(other.getName())
                && this.expYear.equals(other.expYear);
            
        }
       return false;
    }

    

}
