import static java.lang.System.*;
public class MathCube
{
    private static int surfaceArea;
    public static void main(String[] arqs)
    {
        calculateSurfaceArea(112);
        printSurfaceArea();
        calculateSurfaceArea(4);
        printSurfaceArea();
        calculateSurfaceArea(33);
        printSurfaceArea();
        calculateSurfaceArea(50);
        printSurfaceArea();
    }
    public static void calculateSurfaceArea(int num1)
    {
        surfaceArea = 6*(num1*num1);
    }    
    public static void printSurfaceArea()
    {
        out.println("The surface area is :: "+surfaceArea);
        out.println("\n");
    }
}