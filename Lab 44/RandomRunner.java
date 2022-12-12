import static java.lang.System.*;
import static java.lang.Math.*; 
public class RandomRunner
{
    public static void main(String[] args)
    {
      System.out.println("Random Ranges");
      System.out.println("================");
      Random test = new Random(0,25); 
      System.out.println("Range: 0 to 25 = " + test.getRandom());
      test = new Random(1,3);
      System.out.println("Range: 1 to 3 = " + test.getRandom());
      test = new Random(50,100); 
      System.out.println("Range: 50 to 100 = " + test.getRandom());
      test = new Random(-10,-1);
      System.out.println("Range: -1 to -10 = " + test.getRandom());
      test = new Random(-100,100); 
      System.out.println("Range: -100 to 100 = " + test.getRandom());
      int num6 = (int)(Math.random() * 26) + 65;
      System.out.print("Range: A to Z = " + (char)num6 + "\n");
      double num7 = (Math.random() * 1000) * .001;
      System.out.printf("Range: 0.1 to 1 = %.3f \n", num7);
      int num8 = (int)(Math.random() * 9001) + 1000;
      System.out.print("Range: 1000 to 10000 = " + num8 / 1000 * 1000 + "\n");
    }
}
