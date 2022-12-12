import static java.lang.System.*;
public class stringBasics
{
    public static void main(String[] arqs)
    {
        String phrase1 = "hello world",phrase2 = "jim bob",phrase3 = "sally sue",phrase4 = "computer science",phrase5 = "uil contests";
        printStuff(phrase1);
        printStuff(phrase2);
        printStuff(phrase3);
        printStuff(phrase4);
        printStuff(phrase5);
    }
    public static void printStuff(String sentence)
    {
       out.println("first :: "+first(sentence));
       out.println("last :: "+last(sentence));
       out.println("sum :: "+first(sentence)+" "+last(sentence));
       out.println("\n");
    }
    public static String first(String sentence)
    {
        int space = sentence.indexOf(" ");
        return sentence.substring(0,space);
    }
    public static String last(String sentence)
    {
        int space = sentence.indexOf(" ");
        return sentence.substring(space+1);
    }
}
