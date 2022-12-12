import java.util.Scanner;
public class RectangleStudent
{
    public static void main(String[] args)
     {
     int length, width, perimeter, area; 
     Scanner keyboard = new Scanner(System.in); 
     System.out.print("Enter the Length --> ");
     length=keyboard.nextInt();
     System.out.print("Enter the Width --> ");
     width=keyboard.nextInt();
     System.out.println("\n\n");
     System.out.println("Perimeter = " + (length + length + width + width));
     System.out.println("Area = " + (length * width));  
    }
}