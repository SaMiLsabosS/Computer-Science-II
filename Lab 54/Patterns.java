import static java.lang.System.*;
import java.util.*;
public class Patterns
{
  public static void main(String[] arqs)
  {
    Scanner keyboard = new Scanner(System.in);
    int columns = 1;
    int rows = columns + 2;
    out.print("Enter a number --> ");
    rows = keyboard.nextInt();
    out.println();
    for(int i=1;i <= rows; i++)
    {
      for(int j=columns; j<=i; j++)
      {
        out.print("*");  
      }
      out.println();
    }
    for(int i=1;i <= rows; i++)
    {
      for(int j=rows-1; j>=i; j--)
      {
        out.print("*");  
      }
      out.println();
    }
  }
}