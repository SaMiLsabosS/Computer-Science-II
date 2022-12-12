import java.util.Scanner;
public class TotalCents
{
    public static void main(String[] args)
    {
     int quarters,dimes,nickels,pennies;                  
     Scanner keyboard = new Scanner(System.in); 
     System.out.print("How many pennies do you have --> ");
     pennies=keyboard.nextInt();
     System.out.print("How many nickels do you have --> ");
     nickels=keyboard.nextInt();
     System.out.print("How many dimes do you have --> ");
     dimes=keyboard.nextInt();
     System.out.print("How many quarters do you have --> ");
     quarters=keyboard.nextInt();
     System.out.println("\n");
     int totalCents = ((quarters*25)+(dimes*10)+(nickels*5)+ pennies);
     int dollars = (totalCents/100);
     int cents = (totalCents%100);
     System.out.println("Total Value = "+dollars+" dollars and "+cents+" cents");
    }
}
