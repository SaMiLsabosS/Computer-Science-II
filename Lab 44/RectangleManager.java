import java.util.*;
 public class RectangleManager extends MyRectangle
{
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in);
       MyRectangle rectangle1 = new MyRectangle();
       System.out.println("*************************************");
       System.out.println("  Test Constructor and Input Method");
       System.out.println("*************************************");
       System.out.print("Enter length --> " );
       int length = keyboard.nextInt();
       System.out.print("Enter width --> " );
       int width = keyboard.nextInt();
       System.out.println();
       rectangle1.getPerimeter();
       rectangle1.getArea();
       System.out.println(rectangle1);
       System.out.println("************************");
       System.out.println("  Test Mutator Method");
       System.out.println("************************");
       System.out.print("Enter length --> ");
       length = keyboard.nextInt();
       rectangle1.setLength(length);
       System.out.print("Enter width --> ");
       width = keyboard.nextInt();
       rectangle1.setWidth(width);
       System.out.println();
       rectangle1.getPerimeter();
       rectangle1.getArea();
       System.out.println(rectangle1);
   }
}
