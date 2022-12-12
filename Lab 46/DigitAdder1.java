public class DigitAdder1
{
   private int number, numSum;
   //Constructor
   public DigitAdder1()
   {
        number = 0;  
   }
   //Modifiers
   public void setNumbers(int num)
   {
        number = num;  
   }
   //Other Method
   public  int adderDigits()
   {
        int total = 0;
        numSum = number; 
        while(numSum > 0)
        {
            total = total+numSum%10; 
            numSum = numSum/10;  
        }
        return total;        
   } 
   //to String method
   public String toString()
   {
        return adderDigits() + " is the sum of the digits of " + number; 
   }
}