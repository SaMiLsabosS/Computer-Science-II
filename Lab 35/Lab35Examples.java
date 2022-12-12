import static java.lang.System.*;

public class Lab35Examples
{
    public static void main(String[] arqs)
    {
        //DIVISION ISSUES
        /*
        int num1, num2;
        num1 = 1/2;
        num2 = 5/2;
        out.println("Integer number 1 = " + num1);
        out.println("Integer number 2 = " + num2);
        */
        //DECIMALS
        /*
        double dec1, dec2;
        dec1 = 1.0/2;
        dec2 = 5.0/2;
        out.println("Decimal number 1 = " + dec1);
        out.println("Decimal number 2 = " + dec2);
        */
        //SHORTCUTS
        /*
        int num = 11;
        num++;
        out.println(num);// num = num + 1 = 12
        num--;
        out.println(num);// num = num - 1 = 11
        num*=3;
        out.println(num);// num = num * 3 = 33
        num/=3;
        out.println(num);// num = num / 3 = 3
        num+=5;
        out.println(num);// num = num + 5 = 16
        num-=7;
        out.println(num);// num = num - 7 = 9
        */
        //CASTING
        /*
        out.println('5/2 = " + 5/2);
        out.println("(double)5/2 = " + (double)5/2);
        */
        //PRINT FORMATTING
        
        out.printf("%9.2f\n", 6.34567);
        int num = 345;
        out.printf("The number is =%8d\n", num);
        out.printf("The number is = %-8d\n", num);
        out.printf("%5d%5d",100,200);
    }
}
