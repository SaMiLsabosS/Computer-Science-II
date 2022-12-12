import static java.lang.System.*;
public class RandomRangesSt2
{
   public static void main(String[] args)
   {
    out.println("Random Ranges\n");
    out.println("==============\n");
    out.println("1. Range: 0 to 25 = " + (int)( Math.random()*25));
    out.println("2. Range: 1 to 3 = " + (int)( Math.random()*3 + 1));
    out.println("3. Range: 50 to 100 = " + (int)( Math.random()*50 + 50 ));
    out.println("4. Range: -10 to -1 = " + (int)( Math.random()*-10 + -1));
    out.println("5. Range: -100 to 100 = " + (int)( Math.random()*-100 + 100));
    int num6 = (int)( Math.random()*25 + 65);
    out.println("6. Range: A to Z = " +(char)num6);
    double num7 = ( Math.random()*0.999); 
    out.printf("7. Range: 0 to 1 = " +"%.3f", num7,"\n");
    out.println("8. Range: 1000 to 10000 = " + (int)( Math.random()*1000 + 9000 ));
      
    }
}