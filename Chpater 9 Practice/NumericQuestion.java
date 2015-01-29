
public class NumericQuestion extends Question
{
    private double answser;

    public NumericQuestion()
    {
        
    }
    
    //overload:
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    
    //override:
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        
        return Math.abs(responseAsDouble = answer) <= 0.01;
    }

}
