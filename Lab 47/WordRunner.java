import static java.lang.System.*;
public class WordRunner
{
	public static void main ( String[] args )
	{
		Word w = new Word("Hello");
		out.println(w.getFirstChar());
		out.println(w.getLastChar());
		out.println(w.getBackWards());
		out.println(w+"\n\n");
		w.setString("World");
		out.println(w.getFirstChar());
		out.println(w.getLastChar());
		out.println(w.getBackWards());
		out.println(w+"\n\n");
		w.setString("JukeBox");
		out.println(w.getFirstChar());
		out.println(w.getLastChar());
		out.println(w.getBackWards());
		out.println(w+"\n\n");
		w.setString("TCEA");
		out.println(w.getFirstChar());
		out.println(w.getLastChar());
		out.println(w.getBackWards());
		out.println(w+"\n\n");
		w.setString("UIL");
		out.println(w.getFirstChar());
		out.println(w.getLastChar());
		out.println(w.getBackWards());
		out.println(w);
	}
}