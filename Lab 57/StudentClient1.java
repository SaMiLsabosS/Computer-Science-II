import java.util.Arrays;
import java.util.*;
import static java.lang.System.*;
public class StudentClient1    
{
   public static void main (String[] args)
   {        
     Student[] studentList = new Student[4];
     addStudents(studentList);
     printStudents(studentList);
   }
   //Add students using keyboard
   public static void addStudents(Student[] studentList)
   {
     Scanner keyboard = new Scanner(System.in);  
     String answer = "y";
     int numStudents = 0;
     while(answer.equals("y"))
     {
       out.println("Enter student name --> ");
       String name = keyboard.nextLine();
       out.println("Enter student grade --> ");
       int grade = keyboard.nextInt();
       studentList[numStudents] = new Student(name,grade);
       numStudents++;
       keyboard.nextLine();
       out.println();
       out.println("Enter another student(y/n) --> ");
       answer = keyboard.nextLine();
     }
   }
   // Enter student arrays
   public static void printStudents(Student[] studentList)
   {
       out.println(Arrays.toString(studentList));
       out.println();
       for(int i =0;i<studentList.length;i++)
       {
         out.println(studentList[1]);    
       }
   }    
}