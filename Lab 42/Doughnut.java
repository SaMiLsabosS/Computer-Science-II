import static java.lang.System.*;
public class Doughnut
{
   // instance variables:
   private String flavor;
   private int weight;
   private boolean creme;   
   // Default constructur: No parameters
   public Doughnut()
   {
      flavor = "glazed doughnut";
      weight = 1;
      creme = false;
   }
   // Constructor with parameters
   public Doughnut(String f, int w, boolean c)
   {
      flavor = f; 
      weight = w; 
      creme = c; 
   }
   // Accessors methods (getters)
   public String getFlavor()
   {
      return flavor; 
   }  
   public int getWeight()
   {
      return weight; 
   }  
   public boolean getCreme()
   {
      return creme; 
   }  
   public String eat()
   {
      return "YUMMY!";
   }
}
