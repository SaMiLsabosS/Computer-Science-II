import static java.lang.System.*;
public class DigitCounter1
{
   private int number;
    public DigitCounter1()
   {
      setNumbers(number);     
   }
   public void setNumbers(int num)
   { 
      number = num;    
   }
   public int countDigits()
   {
      int total = 0;
      while(number>0)
      {
          number = number/10;
          total = total+1;
      }
      return total;
   }
   public String toString()
   {
      return number+" contains "+countDigits()+" digits";
   }
}