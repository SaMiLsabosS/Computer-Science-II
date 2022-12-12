import static java.lang.System.*;
public class NumAvg
{
    public static void main(String[] args)
    {
        double one = 5;
        double two = 5;
        double average = (one+two)/2;
        out.printf(one+ " + " +two+ " has an average of "+average+"\n");
        one = 90;
        two = 100;
        average = (one+two)/2;
        out.printf(one+ " + " +two+ " has an average of "+average+"\n");
        one = 100;
        two = 85.8;
        average = (one+two)/2;
        out.printf(one+ " + " +two+ " has an average of "+average+"\n");
        one = -100;
        two = 55;
        average = (one+two)/2;
        out.printf(one+ " + " +two+ " has an average of "+average+"\n");
        
    }
}
