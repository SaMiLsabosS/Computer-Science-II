import static java.lang.System.*;
public class StringWorksheet
{
    public static void main(String[] arqs)
    {
       String one = "sambenwilearethebest";
       String two = "09876543210";
       String three = "02 13 97 68 45 0";
       out.println(one.length());
       out.println(two.length());
       out.println(three.length());
       out.println(one.charAt(2));
       out.println(one.charAt(5));
       out.println(one.charAt(6));
       out.println(one.substring(0,4));
       out.println(one.substring(5));
       out.println(one.substring(9));
       out.println(one.substring(2,7));
       out.println(one.indexOf("abc"));
       out.println(one.indexOf("e"));
       out.println(one.indexOf("hij"));
       out.println(two.indexOf("54"));
       out.println(two.indexOf("24"));
       out.println(one.indexOf('w'));
       out.println(two.indexOf('b'));
       out.println(two.indexOf('s'));
       out.println(three.indexOf("45"));
    }
}