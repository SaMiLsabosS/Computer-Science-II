import static java.lang.System.*;
public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable m = new MultTable(5,5);
		m.printTable();
		m.setTable(3,7);
		m.printTable();
		m.setTable(1,6);
		m.printTable();
		m.setTable(9,9);
		m.printTable();
		m.setTable(7,8);
		m.printTable();
	}
}