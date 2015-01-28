

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    
    private int currentVal1;
    private int currentVal2;
    private int currentVal3;
    
    // 0: nothing entered; 1: secret1 done; 2: secret2 done; 3: secret3 done and unlocked
    private int lockState;
    private int currentNumber;
    private boolean checkSoFar;

    /**
     * Default constructor for objects of class ComboLock
     */
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.checkSoFar = true;
        this.lockState = 0;
    }
    
    public void reset()
    {
        currentNumber = 0;
        checkSoFar = true;
        lockState = 0;
    }
    
    public void turnLeft( int ticks )
    {
       currentNumber = (currentNumber - ticks) % 40;
       if(lockState == 1)
       {
           if(currentNumber == secret2)
           {
               lockState = 2;
            }
            
        }
        else
        {
            checkSoFar = false;
        }
        
        
//         if(checkSoFar)
//        {
//            ticks = 39 - ticks;
//            currentNum += ticks;
//            if( currentNum > 39 )
//            {
//                currentNum -= 39;
//            }
//            
//            if (currentNum != this.secret2)
//            {
//                this.checkSoFar = false;
//             }
//        }
    }
    
    public void turnRight( int ticks )
    {
        currentNumber = (currentNumber - ticks + 40) % 40;
        if(lockState == 0)
        {
            if(currentNumber == secret1)
            {
                lockState = 1;
            }
        }
        else if(lockState == 2)
        {
            if(currentNumber == secret3)
            {
                lockState = 3;
            }
            else
            {
                checkSoFar = false;
            }
        }
        
        
        
//         if( checkSoFar )
//         {
//             if(currentNum == 0)
//             {
//                 currentNum += ticks;
//                 if( currentNum != this.secret1 )
//                 {
//                     this.checkSoFar = false;
//                 }
//             }
//             else
//             {
//                 currentNum += ticks;
//                 if(currentNum > 39)
//                 {
//                     currentNum -= 39;
//                 }
//                 
//                 if(currentNum != this.secret3)
//                 {
//                     this.checkSoFar = false;
//                 }
//             }
//         }
    }
    
    public boolean open()
    {
        return checkSoFar;
    }

    

}
