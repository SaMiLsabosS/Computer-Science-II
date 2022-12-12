import static java.lang.System.*;
import java.util.Scanner;
public class StringOrEven
{
    private String word;
    public StringOrEven()
    {
        setString("");
    }
    public StringOrEven(String s)
    {
        setString(s);
    }
    public void setString(String w)
    {
        word = w;
    }
    public boolean isEven()
    {
        if (word.length() % 2 == 0)
        return true;
        return false;
    }
    public String toString()
    {
        if (isEven())
            return word + " is even.";
            return word + " is odd. ";
    }
}
