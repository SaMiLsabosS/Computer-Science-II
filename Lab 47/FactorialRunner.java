import static java.lang.System.*;
public class FactorialRunner
{
	public static void main ( String[] args )
	{
	    Factorial f = new Factorial(5);
	    out.println(f);
	    f.setNum(4);
	    out.println(f);
	    f.setNum(8);
	    out.println(f);
	    f.setNum(15);
	    out.println(f);
	    f.setNum(6);
	    out.println(f);
	    f.setNum(9);
	    out.println(f);
	    f.setNum(3);
	    out.println(f);
	}
}