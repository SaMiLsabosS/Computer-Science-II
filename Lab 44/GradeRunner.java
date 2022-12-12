import static java.lang.System.*;
import java.util.Scanner;

public class GradeRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a number grade :: ");
		int grade = keyboard.nextInt(); 
		Grade theGrade = new Grade(grade);
		out.println(theGrade);  //78

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);  //92

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);  //31

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);  //82

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);   //77

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);   //73

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);   //55

		out.print("Enter a number grade :: ");
		grade = keyboard.nextInt(); 
		theGrade.setGrade(grade);
		out.println(theGrade);   //65
	}
}