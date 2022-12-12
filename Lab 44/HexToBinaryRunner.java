import static java.lang.System.*; 
import java.util.Scanner;
public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		HexToBinary prog = new HexToBinary();
        prog.setHex(letter);
        out.println(prog); 
        out.print("\n");
        out.print("Enter a letter :: ");
		char leter = keyboard.next().charAt(0);
		 prog.setHex(leter);
        out.println(prog);
        out.print("\n");
        out.print("Enter a letter :: ");
		char lettter = keyboard.next().charAt(0);
		 prog.setHex(lettter);
        out.println(prog);
        out.print("\n");
        out.print("Enter a letter :: ");
		char letttter = keyboard.next().charAt(0);
		 prog.setHex(letttter);
        out.println(prog);
        out.print("\n");
        out.print("Enter a letter :: ");
		char lette = keyboard.next().charAt(0);
		 prog.setHex(lette);
        out.println(prog);
        out.print("\n");
        out.print("Enter a letter :: ");
		char lett = keyboard.next().charAt(0);
		 prog.setHex(lett);
        out.println(prog);
        out.print("\n");
        out.print("Enter a letter :: ");
		char let = keyboard.next().charAt(0);
		 prog.setHex(let);
        out.println(prog);
	}
}