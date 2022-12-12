import static java.lang.System.*;
import java.util.Scanner;
public class GradesNeeded
{
   private static double a,b,c,d,gradeNeeded;
   public static void main(String[] arqs)
   {
       Scanner keyboard = new Scanner(System.in);
       out.print("-----------------\n");
       out.print("   getData       \n");
       out.print("-----------------\n");
       out.print("Enter desired semester average --> ");
       a = keyboard.nextDouble();
       out.print("Enter 1st six weeks average --> ");
       b = keyboard.nextDouble();
       out.print("Enter 2nd six weeks average --> ");
       c = keyboard.nextDouble();
       out.print("Enter 3rd six weeks average --> ");
       d = keyboard.nextDouble();
       calculateGradeNeeded(a,b,c,d);
       out.print("\n\n");
       out.print("----------------------\n");
       out.print(" calculateGradeNeeded\n");
       out.print("---------------------- \n\n\n");
       out.print("-----------------\n");
       out.print("  printResults   \n");
       out.print("----------------- \n\n");
       printResults(gradeNeeded);
   }
   public static void calculateGradeNeeded(double a, double b, double c, double d)
   {
       gradeNeeded = (a - (0.8 * (b + c + d) / 3) ) / 0.2;
   }
   public static void printResults(double gradeNeeded)
   {
       out.print("Semester Average Goal = "+(int)a);
       out.print("\n");
       out.printf("Grade Needed to Achieve Goal = %.2f", gradeNeeded);
   }
}
