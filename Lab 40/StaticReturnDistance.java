import java.util.Scanner;
public class StaticReturnDistance
{
    public static void main(String[] arqs)
    {
        int x1,y1,x2,y2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter X1 :: ");
        x1=keyboard.nextInt();
        System.out.print("Enter Y1 :: ");
        y1=keyboard.nextInt();
        System.out.print("Enter X2 :: ");
        x2=keyboard.nextInt();
        System.out.print("Enter Y2 :: ");
        y2=keyboard.nextInt();
        calcDistance(x1,y1,x2,y2);
        System.out.printf("distance == %.3f",calcDistance(x1,y1,x2,y2));
        System.out.println("\n\n");
        System.out.print("Enter X1 :: ");
        x1=keyboard.nextInt();
        System.out.print("Enter Y1 :: ");
        y1=keyboard.nextInt();
        System.out.print("Enter X2 :: ");
        x2=keyboard.nextInt();
        System.out.print("Enter Y2 :: ");
        y2=keyboard.nextInt();
        calcDistance(x1,y1,x2,y2);
        System.out.printf("distance == %.3f",calcDistance(x1,y1,x2,y2));
        System.out.println("\n\n");
        System.out.print("Enter X1 :: ");
        x1=keyboard.nextInt();
        System.out.print("Enter Y1 :: ");
        y1=keyboard.nextInt();
        System.out.print("Enter X2 :: ");
        x2=keyboard.nextInt();
        System.out.print("Enter Y2 :: ");
        y2=keyboard.nextInt();
        calcDistance(x1,y1,x2,y2);
        System.out.printf("distance == %.3f",calcDistance(x1,y1,x2,y2));
    }
    public static double calcDistance(double x1, double y1, double x2, double y2)
    {
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return distance;
    } 
}
