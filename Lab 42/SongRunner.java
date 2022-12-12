import static java.lang.System.*;
public class SongRunner
{
    public static void main(String[] arqs)
    {
       Song despacito = new Song();
       Song hello = new Song("Adele", "Hello", 210); 
       Song beautiful = new Song("James Blunt", "You are beautiful", 200);
       out.println(despacito);
       out.println(hello); // Call toString Method to print info 
       despacito.setArtist("Justin Bieber"); // Modify the artist
       despacito.setTimeSecs(200); 
       out.println(despacito);
       
       out.println("Artist: "+ despacito.getArtist() + ", " + hello.getArtist() + ", " + beautiful.getArtist());
       beautiful.play(); // Call other method play()
    }
}
