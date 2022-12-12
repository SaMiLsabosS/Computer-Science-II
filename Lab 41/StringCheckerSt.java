import static java.lang.System.*;
public class StringCheckerSt
{
    public static void main ( String[] args )
  {
      check("chicken", "c");
      check("chicken", "ch");
      check("chicken", "x");
      out.println("chicken\n\n");
      check("alligator", "g");
      check("alligator", "all");
      check("alligator", "gater");
      out.println("alligator\n\n");
      check("COMPUTER SCIENCE IS THE BEST!", "U");
      check("COMPUTER SCIENCE IS THE BEST!", "COMP SCI");
      check("COMPUTER SCIENCE IS THE BEST!", "SCIENCE");
      out.println("COMPUTER SCIENCE IS THE BEST!");
  } 
   public static void check(String one, String two)
  {
      int index = one.indexOf(two);
      if(index > -1)
      {
         out.println("looking for "+two+" true"); 
      }
      else
      {
         out.println("looking for "+two+" false");
      }
  }
}