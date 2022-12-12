import static java.lang.System.*;
public class CatRunner
{
    public static void main(String[] args)
    {
        Cat catOne = new Cat();
        Cat catTwo = new Cat("Derek","orange","bengal", 1); 
        
        out.println(catOne);
        out.println(catTwo);
        
        catTwo.setColor("black");
        
        out.println("My new cat is the color " + catTwo.getColor());
        
        out.println(catTwo);
        out.println(catOne.isPurring());
        out.println(catTwo.isPurring()); 
    }  
}