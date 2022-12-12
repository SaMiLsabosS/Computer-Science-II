
public class Automobile
{
   private int speed;
   private int gas;
   private boolean temp;
   //Constructors
   public Automobile()
   {
     speed = 40;
     gas = 50;
     temp = true;
   }
   
   public Automobile(int s, int g, boolean t)
   {
     speed = s;
     gas = g;
     temp = t;
   }
   //Setters modifiers
   public void setSpeed(int s)
   {
     speed = s;  
   }
   
   public void setGas(int g)
   {
     gas = g;  
   }
   
   public void setTemp(boolean t)
   {
     temp = t;  
   }
   
   public int getSpeed()
   {
     return speed;  
   }
   
   public int getGas()
   {
     return gas;  
   }
   
   public boolean getTemp()
   {
     return temp;  
   }
   
   public String toString()
   {
     if(temp) // DO NOT WRITE .EQUALS OR ==
     {
        return "Temperature is OK continue driving to " + speed + "MPH and tank gas " + gas + "%"; 
     }
     return "You are a " + speed + "MPH and tank gas " + gas + "%, but you must STOP car because the temperature is high";  
   }
}
