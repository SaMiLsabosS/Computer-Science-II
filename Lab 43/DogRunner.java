import static java.lang.System.*;
public class DogRunner
{
    public static void main(String[] args)
    {
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog("Harold","brown","golden retriever", 1); 
        
        out.println(dogOne);
        out.println(dogTwo);
        
        dogTwo.setColor("black");
        
        out.println("My new dog is the color " + dogTwo.getColor());
        
        out.println(dogTwo);
        out.println(dogOne.isBarking());
        out.println(dogTwo.isBarking()); 
    }  
}