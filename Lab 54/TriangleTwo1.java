import static java.lang.System.*;

public class TriangleTwo1
{
   // Instance variables
    private int size; 
    private String letter;
   //Default constructor
	public TriangleTwo1()
	{
	    size = 0;
	    letter = "";
	}
	// Constructor with parameters

	public TriangleTwo1(String let, int sz)
	{
	    size = sz;
	    letter = let;
	}

	public void setTriangle(int count, String let)
	{
	    size = count;
	    letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString() // Here you design a nested loop
	{
		String output = "";
        for(int i = 1; i<=size; i++)
        {
          for(int j = size; j>=i; j--)
          {
             output += getLetter(); // output = output + getLetter();  
          }
          output +="\n";
        }
		return output+"\n";
	}
}