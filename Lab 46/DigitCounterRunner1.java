import static java.lang.System.*;
public class DigitCounterRunner1
{
	public static void main( String args[] )
	{
	 DigitCounter1 test = new DigitCounter1();
	 test.setNumbers(234);
	 out.println(test+"\n");
	 test.setNumbers(10000);
	 out.println(test+"\n");
	 test.setNumbers(111);
	 out.println(test+"\n");
	 test.setNumbers(9005);
	 out.println(test+"\n");
	 test.setNumbers(84645);
	 out.println(test+"\n");
	 test.setNumbers(8547);
	 out.println(test+"\n");
	 test.setNumbers(123456789);
	 out.println(test);
  }
}