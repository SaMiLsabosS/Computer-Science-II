import static java.lang.System.*;
public class ObjectPractice
{
    public static void main(String[] arqs)
    {
       Doughnut one = new Doughnut();
       Doughnut two = new Doughnut("creme-filled chocolate", 1, true); 
       out.println("donut1: "+ one.getFlavor() + ", donut2: " +  two.getFlavor() + " doughnut");
       out.println(one.eat());
    }
}
