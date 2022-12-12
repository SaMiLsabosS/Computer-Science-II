import static java.lang.System.*;
import static java.lang.Math.*; 
public class Random
{
   private int minimum;
   private int maximum;
   private int range;
   public Random()
   {
       minimum = 0;
       maximum = 0;
       range  = 0;
   }
   public Random(int min, int max)
   {
        minimum = min;
        maximum = max;
        range = maximum - minimum;

   }  
   public void setRange(int min,int max)
   {
       minimum = min;
       maximum = max;
       range = maximum - minimum;
   }   
   public int getRandom()
   {
        return (int)(Math.random() * (range + 1)) + (maximum - range);
        
   }  
   public String toString()
   {
        return getRandom() + "";
   }   
}



