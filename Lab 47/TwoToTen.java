import static java.lang.System.*;
import java.lang.Math;
public class TwoToTen
{
	private String binary;
    
	public TwoToTen()
	{
	    binary = "";
	}

	public TwoToTen(String bin)
	{
	    binary = bin;
	}

	public void setTwo(String bin)
	{
	    binary = bin;
	}

	public int getBaseTen( )
	{
		int ten=0;
		for(int i = 0; i<binary.length(); i++)
		{
		   char bit = binary.charAt(binary.length()-1-i);
		   ten = ten+ (2*i)*(int)bit-48;
        }
		return ten;
	}

	public String toString()
	{
		return binary+" == "+getBaseTen()+"\n";
	}
}