import java.util.Arrays;
import static java.lang.System.*;
public class StudentClient
{
   public static void main (String[] args)
   {
      Student[] studentList =  new Student[4];
      studentList[0] = new Student("John", 12);
      studentList[1] = new Student("Julia", 9);
      out.println(Arrays.toString(studentList));
      out.println();   
      studentList[1].setGrade(11);
      out.println(Arrays.toString(studentList));
      out.println();
      for(int i = 0;i<studentList.length;i++)
      {
          out.println(studentList[i]);
      } 
   }
}