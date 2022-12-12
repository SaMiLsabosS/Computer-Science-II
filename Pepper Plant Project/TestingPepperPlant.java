import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;
public class TestingPepperPlant
{
    public static void main(String[] arqs)
    {
       Scanner keyboard = new Scanner(System.in);
       PepperPlant[] plant = createPepperList(5);
       String pepperName = "";
       int numPepper = 0;
       out.println("Number of Peppers to stimulate growth: 5");
       for(int i = 0;i<plant.length;i++)
       {
         out.println(i + " "+plant[i].getName());
         out.println("1 Serrano");
         out.println("2 Habanero");
         out.println("3 Poblano");
         out.println("4 Chili");  
       }    
    }
    public static PepperPlant[] createPepperList(int num)
    {
       String[] pepperName = {"Jalapeno", "Serrano", "Habanero", "Pabloano", "Pimento"};       
       
    }
}
