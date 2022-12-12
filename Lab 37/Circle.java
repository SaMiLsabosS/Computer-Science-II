import static java.lang.System.*;
public class Circle
{
    private static double area;
    public static void main(String[] arqs)
    {
        calculateArea(7.5);
        printArea(7.5);
        calculateArea(10);
        printArea(10);
        calculateArea(72.534);
        printArea(72.534);
        calculateArea(55);
        printArea(55);
        calculateArea(101);
        printArea(101);
        calculateArea(99.952);
        printArea(99.952);
    }    
    public static void calculateArea(double num1)
    {
        area = 3.14159265359*(num1 * num1);
    }    
    public static void printArea(double num1)
    {
        out.printf("The area is :: "+"%.4f", area);
        out.printf("\n\n");
    }    
}
