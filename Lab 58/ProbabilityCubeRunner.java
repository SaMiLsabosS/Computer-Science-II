import static java.lang.System.*;
public class ProbabilityCubeRunner
{
    public static void main(String[] args)
    {
       ProbabilityCube cub1 = new ProbabilityCube ("Yellow",6,4);
       out.println(cub1);
       out.print("When I roll my cube of  " + cub1.getNumFaces() + " sides 10 times, I get:   ");
       printRolling(cub1); 
       cub1.setNumFaces(8);
       out.println();
       out.print("When I roll my cube of  " + cub1.getNumFaces() + " sides 10 times, I get:   ");
       printRolling(cub1);
       cub1.setNumFaces(20);
       out.println();
       out.print("When I roll my cube of  " + cub1.getNumFaces() + " sides 10 times, I get:   ");
       printRolling(cub1);
    }       
    public static void printRolling(ProbabilityCube cub1)
        {
        for(int i = 0; i<= 10; i++)
        {
            cub1.roll();
            out.print(cub1.getFaceValue() + ", ");
        }
    }
}  