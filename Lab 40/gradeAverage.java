
public class gradeAverage
{
    public static void main (String [] arqs)
    {
      System.out.printf("The grade average is : %.2f", + calAverage(61,72,85));
    }
    public static double calAverage(double grade1, double grade2, double grade3)
    {
      double avg = (grade1 + grade2 + grade3)/3;
      return avg;
    }
}
