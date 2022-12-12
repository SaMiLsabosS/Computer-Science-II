import static java.lang.System.*;
public class SlotMachineRunnerEC
{
    public static void main(String[] args)
    {
        SlotMachineEC test = new SlotMachineEC("BAR", "WILD", "watermelon", "heart", "seven", "diamond", 3);
        int count = 1;           
        //Part A
        while ( !test.getWinner() )
        {
            out.println("Spin " + count + ": " + test.spin());
            if(test.getWinner() == true)
                out.println("you won  \n");
            else
                out.println("you lose \n");
            count++;
        }    
        out.println();
        //you will add code for Part B
        trials(test, 1);        
        trials(test, 5);
        trials(test, 10);        
        trials(test, 100);
        trials(test, 1000);
        trials(test, 5000);
    }
    // Part B  Method
    public static void trials(SlotMachineEC test, int num)
    {
        int count = 0;
        double average = 0.0;
        for(int number = 0; number < num; number++) 
        {
            test.setWinner(false);
            while ( !test.getWinner() )
            {
               test.spin();
               count++;
            }   
        }   
        average = (double)count/num;
        out.println("avg for " + num + " trials is: " + average); 
    }
}