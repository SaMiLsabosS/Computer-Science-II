import static java.lang.System.*;
public class StringMethods
{
    public static void main(String[] arqs)
    {
       /*
       //equals. compares the chars ofString1 with String2
       //String color = "red";
       //String color1 = "blue";
       String color = new String ("red");
       String color1 = new String ("blue");
       if(color.equals(color1))
       {
          out.println("The colors are equal");   
       }
       else
       {
          out.println("The colors are not equal"); 
       } 
       */
      //compareTo. Compares if String1 is >, <, or == to String2
      //String one = "ABC";
      //String two = "abc";
      
      //out.println(two.compareTo(one));
      /*
       String fruit1 = "mango";
       String fruit2 = "banana";
       if(fruit1.compareTo(fruit2)<0)
       {
        out.println(fruit1+" is before " +fruit2); 
       }
       else
       {
        out.println(fruit1+" is after " +fruit2); 
       }
      */
     
      //toUpperCase() and toLowerCase()
      
      String word = "computer";
      
      out.println(word.toUpperCase()); 
      out.println(word.toLowerCase());
      
      //trim. removes white spaces 
      out.println(word.trim());
    }
}

