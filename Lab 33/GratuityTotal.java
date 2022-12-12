import java.util.Scanner;
public class GratuityTotal
{
   public static void main(String[] args)
    {
        int subtotal, gratuityRate;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal=keyboard.nextInt();
        gratuityRate=keyboard.nextInt();
        double gratuity = (gratuityRate/10.0);
        double total = (gratuity + subtotal);
        System.out.print("The gratuity is "+gratuity+" and total is "+total);
    }
}