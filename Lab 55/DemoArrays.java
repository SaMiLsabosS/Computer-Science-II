import java.util.Arrays;
import static java.lang.System.*;
public class DemoArrays
{
   public static void main( String arqs[])
   {
      //Declare and define an Array
      /*
      int[] myArray =  new int[10]; // type[] (name of array) = new type[value];
      //Create and print it
      for(int i = 0; i<myArray.length;i++)
      {
        myArray[i] =(int)((Math.random() * 100) +1);
        out.print(myArray[i] + " ");
      }
      */
     
     //Three differs way to print an Array
     //1) Using a for loop
      int[] myArray = {5,7,19,4,3}; 
     for(int i = 0; i<myArray.length; i++)
     {
       out.print(myArray[i] + " "); //out.print(name of array [i (+any number)] + " ");
     }
     out.println();
     //2) Using a each for loop
     for(int item : myArray) //for(type name : name of Array)
     {
       out.print(item+ " ");    
     }
     out.println();
     
     //Print using a toString method
     
     out.print(Arrays.toString(myArray));
   }
}