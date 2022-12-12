import java.util.Scanner;
import static java.lang.System.*;
public class WorldList
{
  public static void main( String arqs[])
  {
     Scanner keyboard = new Scanner(System.in);
     out.print("Enter number of words --> ");
     int num = keyboard.nextInt();
     keyboard.nextLine();
     String[] words = new String[num];
     out.println();
     for(int i = 0; i<words.length;i++)
     {
        words[i] = keyboard.nextLine();
     }
     out.println();
      // Print the second set usign each for loop
     for(String item : words)
     out.println(item);
      // Print in reverse order
     out.println();
     for(int i = num-1; i>=0; i--)
     {
        out.println(words[i]);
     }
     
     for(int i=0; i<words.length; i++)
     {
        out.println(words[words.length-i-1]);  
     }
  }
}