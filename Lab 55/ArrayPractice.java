import java.util.*;
import static java.lang.System.*;
public class ArrayPractice
{
    
    public static void main(String[] args)
    {
       ArrayPractice app = new ArrayPractice();
 
       app.method1();
       app.method2();
       app.method3();
       app.method4();
    }
 
    public void method1()
    {
       int[] array1 = {2,4,6,8,10}; 
       for(int i = 0; i<array1.length; i++)
       {
         out.print(array1[i] + " ");
       }
       out.println();
       out.println();
    }
 
    public void method2()
    {
       int[] array2 = new int[5];
       array2 [0] = 10;
       array2 [1] = 20;
       array2 [2] = 30;
       array2 [3] = 40;
       array2 [4] = 50;
       for(int i = 0; i<array2.length; i++)
       {
         out.print(array2[i] + " ");
       }
       out.println();
       out.println();
    }
 
    public void method3()
    {
       double[] array3 = new double[4];
       array3 [0] = 5.6;
       array3 [1] = 9.9;
       for(double item : array3)
       {
         out.print(item+ " ");    
       }
       out.println();
       out.println();
    }
 
    public void method4()
    {
       String[] array4 = new String[3];
       array4 [0] = "Dog";
       array4 [2] = "Cat";
       for(String item : array4)
       {
         out.print(item+ " ");    
       }
    }
 
}
