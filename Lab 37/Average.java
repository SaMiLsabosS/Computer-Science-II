

public class Average
{
    private static double ave;
    public static void main(String[] arqs)
    {
        calcAverage(5,5);
        printAverage(5,5);
        calcAverage(90,100);
    }
    
    public static void calcAverage(double num1, double num2)
    {        
        ave = (num1 + num2)/2;
        //System.out.print(num1+" + "+num2+" has an average of  ");
        //System.out.printf("%.2f\n\n", ave);
        
    }
    
    public static void printAverage(double num1, double num2)
    {
        System.out.print(num1+" + "+num2+" has an average of  ");
        System.out.printf("%.2f\n\n", ave);
    }
}
