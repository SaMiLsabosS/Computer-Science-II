import java.util.*;
import static java.lang.System.*;
public class StartEndLetterSt
{
    public static void main(String[] args)
    {
        String p1="Hello ", p2="World ", p3="JukeBox ", p4="TCEA ", p5="UIL ";
        printThree(p1);        
        printThree(p2);
        printThree(p3);
        printThree(p4);
        printThree(p5);
    }
    public static char printOne(String one)
    {
        char firstLetter =  one.charAt(0);
        return firstLetter;
    }
    public static String printTwo(String one)
    {
        int space = one.indexOf(" ");
        String lastLetter =  one.substring(space-1);
        return lastLetter;
    }    
    public static void printThree(String one)
    {
        out.println("word :: "+one);
        out.println("first letter :: "+printOne(one));
        printTwo(one);
        out.println("last letter :: "+printTwo(one));
        out.println("\n");
    }
    }