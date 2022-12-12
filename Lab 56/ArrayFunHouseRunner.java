import java.util.Arrays;
import static java.lang.System.*;
public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
	    int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		out.println(Arrays.toString(one));
		out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		out.println("# of 4s  =  "+ArrayFunHouse.getCount(one,4));
		out.println("# of 9s  =  "+ArrayFunHouse.getCount(one,9));
		out.println("# of 7s  =  "+ArrayFunHouse.getCount(one,7));
		out.println("new array with all 7s removed  =  "+Arrays.toString(ArrayFunHouse.removeVals(one,7)));
        out.println("# of 7s  =  "+(ArrayFunHouse.getCount(one,7) - ArrayFunHouse.getCount(one,7)));
        out.println("\n");
		int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
        out.println(Arrays.toString(two));
		out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(two,3,16));
		out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two,2,9));
		out.println("# of 0s  =  "+ArrayFunHouse.getCount(two,0));
		out.println("# of 3s  =  "+ArrayFunHouse.getCount(two,3));
		out.println("# of 7s  =  "+ArrayFunHouse.getCount(two,7));
		out.println("new array with all 7s removed  =  "+Arrays.toString(ArrayFunHouse.removeVals(two,7)));
        out.println("# of 7s  =  "+(ArrayFunHouse.getCount(two,7) - ArrayFunHouse.getCount(two,7)));
    }
}