import static java.lang.System.*;
public class Song
{
   // instance variables:
   private String artist;
   private String title;
   private int timeSecs;   
   // Default constructur: No parameters
   public Song()
   {
      artist = "Luis Fonsi";
      title = "Despacito";
      timeSecs = 190;
   }
   // Constructor with parameters
   public Song(String a, String t, int s)
   {
      artist = a;
      title = t;
      timeSecs = s;
   }
   // Accessors methods (getters)
   public String getArtist()
   {
      return artist; 
   }  
   public String getTitle()
   {
      return title; 
   }  
   public int getTimeSecs()
   {
      return timeSecs; 
   }  
   // Modifiers or mutators (setters)
   public void setArtist(String ar)
   {
      artist = ar; 
   }    
   public void setTitle(String ti)
   {
      title = ti; 
   }  
   public void setTimeSecs(int se)
   {
      timeSecs = se; 
   }  
   // Other methods
   public void play()
   {
      out.println("Dada daba du");
   }
   // toString Return Method to print info grom the object
   public String toString()
   {
      return ("Artist: " +artist+ ", Title: " +title+", Duration: " +timeSecs);   
   }
   
   
   
}
