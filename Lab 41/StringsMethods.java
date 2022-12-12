import static java.lang.System.*;
public class StringsMethods
{
    public static void main (String[] arqs)
    {
      String fruit = "watermelon";
      // length returns # of characters
      out.println(fruit.length()); // 10
      // charAt(x) returns the char at spot x 
      char letter = fruit.charAt(5);
      out.println(fruit.charAt(5)); // m
      out.println(letter); // m
      // substring(x,y)returns section of the string from x to y( not included )
      out.println(fruit.substring(0,5)); // water
      out.println(fruit.substring(6)); // melon
      //indexOf(str0 returns the location of the string from spot 0 to length-1 (the first charcter # of the index
      out.println(fruit.indexOf("ter")); // 2
      out.println(fruit.indexOf("e")); // 3
      out.println(fruit.indexOf("x")); // -1
      //lastIndexOf(str)returns the location of string from length-1 to spot     
      out.println(fruit.lastIndexOf("ter")); // 2      
      out.println(fruit.lastIndexOf("e")); // 6
    }
}
