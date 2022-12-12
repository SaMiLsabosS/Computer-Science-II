import java.util.Scanner;
public class StaticReturnTriangle
{
    public static void main(String[] arqs)
    {
     int a, b, c;
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter side A ::  ");
     a=keyboard.nextInt();
     System.out.print("Enter side B ::  ");
     b=keyboard.nextInt();
     System.out.print("Enter side C ::  ");
     c=keyboard.nextInt();
     System.out.print("\n");
     System.out.println(a+" "+b+" "+c);
     calcTriangleArea(a,b,c);
     System.out.printf("Area == %.5f", calcTriangleArea(a,b,c));
     System.out.println("\n\n\n\n");
     System.out.print("Enter side A ::  ");
     a=keyboard.nextInt();
     System.out.print("Enter side B ::  ");
     b=keyboard.nextInt();
     System.out.print("Enter side C ::  ");
     c=keyboard.nextInt();
     System.out.print("\n");
     System.out.println(a+" "+b+" "+c);
     calcTriangleArea(a,b,c);
     System.out.printf("Area == %.5f", calcTriangleArea(a,b,c));
     System.out.println("\n\n\n\n");
     System.out.print("Enter side A ::  ");
     a=keyboard.nextInt();
     System.out.print("Enter side B ::  ");
     b=keyboard.nextInt();
     System.out.print("Enter side C ::  ");
     c=keyboard.nextInt();
     System.out.print("\n");
     System.out.println(a+" "+b+" "+c);
     calcTriangleArea(a,b,c);
     System.out.printf("Area == %.5f", calcTriangleArea(a,b,c));
    }
    public static double calcTriangleArea(double a, double b, double c)
    {
     double parimeter = a+b+c;
     double s = parimeter/2;
     double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
     return area;
    }
}
