import static java.lang.System.*;
public class TriangleOneRunner
{
    public static void main ( String[] args )
    {
        TriangleOne w = new TriangleOne();
        w.setWord("Hippo");
        w.print();
        out.println("");
        w.setWord("abcd");
        w.print();
        out.println("");
        w.setWord("it");
        w.print();
        out.println("");
        w.setWord("a");
        w.print();
        out.println("");
        w.setWord("chicken");
        w.print();
    }
}