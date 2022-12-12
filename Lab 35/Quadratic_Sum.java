import java.util.Scanner;
import static java.lang.System.*;
public class Quadratic_Sum
{
   public static void main(String[] args)
   {
    int a,b,c;
    double d,e;
    Scanner keyboard = new Scanner(System.in);
    out.print("\nEnter a::");
    a = keyboard.nextInt();
    out.print("\nEnter b::");
    b = keyboard.nextInt();
    out.print("\nEnter c::");  
    c = keyboard.nextInt();
    d =(-b - Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    e =(-b + Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    out.printf("\nrootone:: "+"%.2f",e);
    out.printf("\nroottwo:: "+"%.2f",d);
    out.print("\n");
    out.print("\nEnter a::");
    a = keyboard.nextInt();
    out.print("\nEnter b::");
    b = keyboard.nextInt();
    out.print("\nEnter c::");  
    c = keyboard.nextInt();
    d =(-b - Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    e =(-b + Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    out.printf("\nrootone:: "+"%.2f",e);
    out.printf("\nroottwo:: "+"%.2f",d);
    out.print("\n");
    out.print("\nEnter a::");
    a = keyboard.nextInt();
    out.print("\nEnter b::");
    b = keyboard.nextInt();
    out.print("\nEnter c::");  
    c = keyboard.nextInt();
    d =(-b - Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    e =(-b + Math.sqrt( b*b - 4 * a * c)) / (2 * a);
    out.printf("\nrootone:: "+"%.2f",e);
    out.printf("\nroottwo:: "+"%.2f",d);
    }
}
