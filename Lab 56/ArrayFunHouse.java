import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum = 0;
		for(int count = start; count <= stop; count++)
		{
		    sum += numArray[count];
		  }	    
	    return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int count = 0;
        for(int i=0; i<numArray.length; i++)
        {
            if(numArray[i] == val)
            {
                count++;
            }
        }
        return count; 
	}

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