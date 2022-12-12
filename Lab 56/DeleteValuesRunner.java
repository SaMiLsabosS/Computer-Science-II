import java.util.Arrays;
import static java.lang.System.*;
public class DeleteValuesRunner
{
	public static void main( String args[] )
	{
		int[] two; // In class the name is newArray
	    int[] one = {5,0,1,5,7,10,8,5,4,5,5};
	    out.println(Arrays.toString(one));
	    out.println("# of 5's = "+DeleteValues.getCount(one,5));
	    two = DeleteValues.removeVals(one, 5); 
	    out.println("After removing all 5's " + Arrays.toString(two));
	    out.println("# of 5's = "+ DeleteValues.getCount(two,5));
	}
}