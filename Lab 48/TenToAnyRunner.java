import static java.lang.System.*;
public class TenToAnyRunner
{
	public static void main( String args[] )
	{
		TenToAny c = new TenToAny(234,9);
		out.println(c);
        c.setNewNum(100, 2);
        out.println(c);
        c.setNewNum(10, 2);
        out.println(c);
        c.setNewNum(15, 2);
        out.println(c);
        c.setNewNum(256, 2);
        out.println(c);
        c.setNewNum(100, 8);
        out.println(c);
        c.setNewNum(250, 16);
        out.println(c);
        c.setNewNum(56, 11);
        out.println(c);
        c.setNewNum(89, 5);
        out.println(c);
        c.setNewNum(23, 3);
        out.println(c);
        c.setNewNum(50, 4);
        out.println(c);
        c.setNewNum(55, 6);
        out.println(c);
        c.setNewNum(2500, 16);
        out.println(c);
        c.setNewNum(2500, 13);
        out.println(c);
	}
}