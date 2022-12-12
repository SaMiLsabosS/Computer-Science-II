import java.lang.System;
import java.lang.Math;

public class DeleteValues
{
    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val)
    {
        int count = 0;
        for(int i = 0; i < numArray.length; i++)
        {
          if(numArray[i] == val)
          {
            count++;    
          }
        }
        return count;
    }
    // Create the new array without val (5)
    public static int[] removeVals(int[] numArray, int val)
    {
        int[] newArray = new int[numArray.length-getCount(numArray, val)];
        int j = 0; // Used to create an index of the new array
        for(int i = 0; i<numArray.length; i++)
        {
         if(numArray[i]!=val)
         {
            newArray[j]=numArray[i];
            j++;
         }     
        }
        return newArray;
    }
}