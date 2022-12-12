import java.util.*;
import java.util.Arrays;
public class SongRunner1
{
    Song[] songList = new Song[4];
    private int numSongs; 

    public static void main(String[] args){
        SongRunner1 app = new SongRunner1();
        app.addSongs();
        app.printSongs();

    }

    public  void addSongs()
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "y";
        while(answer.equals("y"))
        {
            System.out.print("Song Name ----> ");
            String songName = keyboard.nextLine();
            System.out.print("Artist Name ----> ");
            String artName = keyboard.nextLine();
            System.out.print("Song Length(secs) ----> ");
            int songLen = keyboard.nextInt();
            songList[numSongs] = new Song(artName, songName, songLen);
            numSongs++;
            keyboard.nextLine();
            System.out.print("\nEnter another song (y/n): ");
            answer = keyboard.nextLine();
            System.out.println();
        }

    }

    public  void printSongs()
    {
        for(int i = 0; i<songList.length;i++)
        {
            if(songList[i] != null){
                System.out.println(songList[i]);
                System.out.println();
            }

        }
    }}