import static java.lang.System.*;
public class DigitAdderRunner1
{
	public static void main( String args[] )
	{
	 DigitAdder1 test = new DigitAdder1();
	 test.setNumbers(234);
	 out.println(test); // call toString method to print 
     test.setNumbers(10000);
	 out.println(test); 
	 test.setNumbers(111);
	 out.println(test); 
	 test.setNumbers(9005);
	 out.println(test); 
	 test.setNumbers(84645);
	 out.println(test);  
	 test.setNumbers(8547);
	 out.println(test); 
	 test.setNumbers(123456789);
	 out.println(test); 
  }
}