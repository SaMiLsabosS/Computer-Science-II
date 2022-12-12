import java.util.Scanner;

public class PythagoreanTheorem
{
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("Enter side 1 --> ");
        a = keyboard.nextInt();
        System.out.print("Enter side 2 --> ");
        b = keyboard.nextInt();
        c = (int)Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println();
        System.out.println("The hypotenuse = " + Math.round(c));
    }
}
