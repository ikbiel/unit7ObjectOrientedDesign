import java.util.Scanner;

public class FillInQuestion extends Question
{
    //specified text: "The inventor of Java is _James Gosing_ from Sun."
    //this class converts the specified text into the prompt and answer
    // text: "The inventor of Java is _____ from Sun."
    // answer: "James Gosling"
    
     

    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
         //do NOT do:
        // text = question;
        // setText(question);
        
        super.setText(question);
        super.setAnswer(answer);
    }

    

}
