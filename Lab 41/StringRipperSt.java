import static java.lang.System.*;
public class StringRipperSt
{
   public static void main(String[] args)
   {
     String p1="chicken", p2="alligator", p3="COMPUTER SCIENCE IS THE BEST!", p4="I like fried chicken and mashed potatoes!";
     out.println(check(p1, 3, 6));
     out.println(p1);
     out.println("\n");
     out.println(check(p2, 3, 8));
     out.println(p2);
     out.println("\n");
     out.println(check(p3, 9, 12));
     out.println(check(p3, 0, 12));
     out.println(check(p3, 5, 19));
     out.println(p3);
     out.println("\n");
     out.println(check(p4, 0, 7));
     out.println(check(p4, 7, 15));
     out.println(check(p4, 15, 26));
     out.println(check(p4, 22, 26));
     out.println(p4);
   }
    // Method to return the specified section (x,y)
   public static String check(String one, int two, int three)
   {
       String phrase = one.substring((int)two,(int)three);
       return phrase;
   }
}