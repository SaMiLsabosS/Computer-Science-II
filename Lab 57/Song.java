
public class Song
{
    String artist;
    String title;
    int timeSec;
    public Song(String art, String titl, int time)
    {
       artist = art;
       title = titl;
       timeSec = time;
    }

    public Song()
    {
       artist = "";
       title = "";
       timeSec = 0;
    }
    
     public String getartist()
    {
       return artist;
    }
    
    public int gettimeSec()
    {
       return timeSec;
    }
    
     public String gettitle()
    {
       return title;
    }
    
    public void setartist(String s)
    {  
       artist = s;
    }
    
    public void settimeSec(int time)
    {
       timeSec = time;
    }
    
    public void settitle(String ti)
    {  
       title = ti;
    }
    
     public String toString()
    {
       return "Song name is = " + title  + ", " + "Song Artist is = " + artist + ", " + "Song duration is = " + timeSec + " seconds" + "\n";  
    }
}
