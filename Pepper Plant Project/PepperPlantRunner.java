import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;
public class PepperPlantRunner
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
        out.println("Select the pepper number you want to stimulate growth: ");
        numPepper = keyboard.nextInt();
        PepperPlant[] options = new PepperPlant[numPepper];
        out.println("Pepper Data<d>,Grow<g>, Water<w>, Fertilize<f>, Pick<p>, Status<s> or Quit<q>: ");
        String option = keyboard.nextLine(); 
        while(!answer.equals("q"))     
        {
          if(answer.equals("d"))
          {
              
          }
          if(answer.equals("g"))
          {
              
          }
          if(answer.equals("w"))
          {
              
          }
          if(answer.equals("f"))
          {
              
          }
          if(answer.equals("p"))
          {
              
          }
          if(answer.equals("s"))
          {
              
          }
        }
    }
    public static PepperPlant[] createPepperList(int num)
    {
        String[] pepperName = {"Jalapeno", "Serrano", "Habanero", "Pabloano", "Pimento"};  
        int[] plantMaturityRate = {3,6,9,12,15};
        int[] fruitMaturityRate = {10,12,14,16,18};
        int[] growthRate = {1,2,3,4,5};
        PepperPlant[] pepperList= new PepperPlant[num];
        for(int i = 0; i<num; i++)
        {
           pepperList[i] = new PepperPlant(pepperName[i],growthRate[i],plantMaturityRate[i], fruitMaturityRate[i]);    
        }
    }
}
