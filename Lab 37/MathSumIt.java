

public class MathSumIt
{
   private static double sum;
   public static void main(String[] arqs)
   {
        printSum(5,5); 
        printSum(90,100); 
        printSum(100.5,85.8); 
        printSum(-100,55); 
        printSum(15236,5642); 
        printSum(1000,555); 
   }
   public static void printSum(double num1, double num2)
   {
       sum = num1+num2;
       System.out.printf(num1+" + "+num2+" == "+"%.2f\n", sum);
       System.out.printf("\n");
   }
}
