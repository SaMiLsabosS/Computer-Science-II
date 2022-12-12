import static java.lang.System.*;
import java.util.Arrays;
public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		int[] one = {2,4,6,8,10,12,14};
		int[] two = {1,2,3,4,5,6,7,8,9};
		int[] three = {2,10,20,21,23,24,40,55,60,61};
		out.println("Odds - "+Arrays.toString(OddsAndEvens.getAllOdds(one)));
		out.println("Evens - "+Arrays.toString(OddsAndEvens.getAllEvens(one)));
		out.print("");
		out.println("Odds - "+Arrays.toString(OddsAndEvens.getAllOdds(two)));
		out.println("Evens - "+Arrays.toString(OddsAndEvens.getAllEvens(two)));
		out.print("");
		out.println("Odds - "+Arrays.toString(OddsAndEvens.getAllOdds(three)));
		out.println("Evens - "+Arrays.toString(OddsAndEvens.getAllEvens(three)));
	}
}