import static java.lang.System.*;
import java.util.Scanner;
public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(in);
        
        System.out.print("Enter a String :: ");
        String word = keyboard.next();
        System.out.println(word.toString());
        System.out.println(new StringOrEven(word));   
 
        System.out.print("Enter a String :: ");
        String even = keyboard.next();
        System.out.println(even.toString());
        System.out.println(new StringOrEven(even));
       
        System.out.print("Enter a String :: ");
        String on = keyboard.next();
        System.out.println(on.toString());
        System.out.println(new StringOrEven(on));
       
        System.out.print("Enter a String :: ");
        String dr = keyboard.next();
        System.out.println(dr.toString());
        System.out.println(new StringOrEven(dr));
       
        System.out.print("Enter a String :: ");
        String wr = keyboard.next();
        System.out.println(wr.toString());
        System.out.println(new StringOrEven(wr));
       
        System.out.print("Enter a String :: ");
        String rt = keyboard.next();
        System.out.println(rt.toString());
        System.out.println(new StringOrEven(rt));
       
        System.out.print("Enter a String :: ");
        String lool = keyboard.next();
        System.out.println(lool.toString());
        System.out.println(new StringOrEven(lool));
       
        System.out.print("Enter a String :: ");
        String daad = keyboard.next();
        System.out.println(daad.toString());
        System.out.println(new StringOrEven(daad));
    }
}
