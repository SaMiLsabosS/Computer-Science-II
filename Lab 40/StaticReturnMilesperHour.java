import java.util.Scanner;
public class StaticReturnMilesperHour
{
    public static void main(String[] arqs)
    {
        int a, b, c;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the distance :: ");
        a=keyboard.nextInt();
        System.out.print("Enter the hours :: ");
        b=keyboard.nextInt();
        System.out.print("Enter the minutes :: ");
        c=keyboard.nextInt();
        System.out.println("\n");
        calcMilesHour(a,b,c);
        System.out.print(a+" miles in "+b+" hour(s) and "+c+" minutes = "+(int)calcMilesHour(a,b,c)+" MPH.");
        System.out.println("\n\n\n");
        System.out.print("Enter the distance :: ");
        a=keyboard.nextInt();
        System.out.print("Enter the hours :: ");
        b=keyboard.nextInt();
        System.out.print("Enter the minutes :: ");
        c=keyboard.nextInt();
        System.out.println("\n");
        calcMilesHour(a,b,c);
        System.out.print(a+" miles in "+b+" hour(s) and "+c+" minutes = "+(int)calcMilesHour(a,b,c)+" MPH.");
        System.out.println("\n\n\n");
        System.out.print("Enter the distance :: ");
        a=keyboard.nextInt();
        System.out.print("Enter the hours :: ");
        b=keyboard.nextInt();
        System.out.print("Enter the minutes :: ");
        c=keyboard.nextInt();
        System.out.println("\n");
        calcMilesHour(a,b,c);
        System.out.print(a+" miles in "+b+" hour(s) and "+c+" minutes = "+(int)calcMilesHour(a,b,c)+" MPH.");
    }
    public static double calcMilesHour(int a, int b, int c)
    {
        double totalMinutes = (b*60)+ c;
        double hours = totalMinutes/60 ;
        double mph = Math.round(a/hours);
        return mph;
    }
}
