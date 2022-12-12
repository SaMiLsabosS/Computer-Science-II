import java.util.Scanner;
public class CelsiustoFahrenheit
{
   public static void main(String[] args)
    {
       int celsius;
       Scanner keyboard = new Scanner(System.in); 
       System.out.print("Enter a degree in Celsius: ");
       celsius=keyboard.nextInt();
       double fahrenheit = (9.0/5)*celsius + 32;
       System.out.print((int)celsius +" Celcius is " +fahrenheit+ " in Fahrenheit");
    }
}
