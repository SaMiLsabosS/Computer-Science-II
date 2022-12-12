import java.util.Scanner;
import static java.lang.System.*;
public class OddsAndEvens
{
    private static int countEm(int[] array)
    {
        int sum = 0;
        for(int i = 0;i<array.length;i++)
        {
          sum = sum + array[i];
        }
        return sum;
    }
    
    public static int[] getAllEvens(int[] array)
    {
        int spot  = 0;
        int evens = 0;
        int odds = 0;
        for(int i = 0; i<array.length;i++)
        {
           if(array[i]%2 == 0)
           {
             evens++;    
           }
        }
        int [] even = new int[evens];
        for(int i = 0; i<even.length; i++)
        {
           if(array[i]%2 == 0)
           {
             even[spot] = array[i];
             spot++;
           }
        }
        return even;
    }

    public static int[] getAllOdds(int[] array)
    {
        int spot = 0;
        int odds = 0;
        for(int i = 0; i<array.length;i++)
        {
           if(array[i]%2 == 1)
           {
             odds++;    
           }
        }
        int [] odd = new int[odds];
        for(int i = 0; i<array.length; i++)
        {
           if(array[i]%2 == 1)
           {
             odd[spot] = array[i];
             spot++;
           }
        }
        return odd;
    }
}