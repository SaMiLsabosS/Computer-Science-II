import static java.lang.System.*; 
public class HexToBinary
{
	private char hex;
	public HexToBinary()
	{
        hex=0;
	}
	public HexToBinary(char hexNum)
	{
        hex=hexNum;
	}
	public void setHex(char hexNum)
	{
        hex=hexNum;
	}
	public String getBinary()
	{
        String binary="";
        switch(hex)
        {
          case 'A' : binary = "1010";break;
          case 'B' : binary = "1011";break;
          case 'C' : binary = "1100";break;  
          case 'D' : binary = "1101";break;
          case 'E' : binary = "1110";break;
          case 'F' : binary = "1111";break;
          default  : binary = "ERROR";
        }
		return binary;
	}
	public String toString()
	{
		return (hex+" is "+getBinary()+" in binary!");
	}
}