import java.util.Arrays;
import static java.lang.System.*;
public class SongRunner
{
   public static void main (String[] args)
   {
      Song[] songList = new Song[4]; //define the array of objects
      songList[0] = new Song("The Weeknd","Blinding Lights",202);
      songList[1] = new Song("Logic","Flexicution",219);
      songList[2] = new Song("Saego","Kinda Lit",183);
      songList[3] = new Song("Modjo","Lady (Hear Me Tonight)",274);
      out.print(Arrays.toString(songList));
   }  
}