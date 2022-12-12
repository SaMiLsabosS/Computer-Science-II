public class IceCream
{
   private String flavor;
   private double price;
   private double temp;
   private boolean melted;
   private boolean empty;
   private double percentQuantity;
   public IceCream()
   {
     flavor = "";
     price = 0.0;
     temp = 0.0;
     melted = true;
     empty = true;
     percentQuantity = 0.0;   
   }
   
   public IceCream(String f, double p, double t, boolean m, boolean e, double pQ)
   {
     flavor = f;    
     price = p; 
     temp = t; 
     melted = m; 
     empty = e;
     percentQuantity = pQ; 
   }
   
   public void setflavor(String f)
   {
     flavor = f;
   }
   
   public void setprice(double p) 
   {
     price = p;   
   }
   
   public void settemp(double t)
   {
     temp = t;  
   }
   
   public void setmelted(boolean m)
   {
     melted = m;  
   }
   
   public void setempty(boolean e)
   {
     empty = e;  
   }
   
   public void setpercentQuantity(double pQ)
   {
     percentQuantity = pQ;  
   }
   
   public String getflavor()
   {
     return flavor;
   }   
   
   public double getprice()
   {
     return price;
   } 
   
   public double gettemp()
   {
     return temp;
   }  
   
   public boolean getmelted()
   {
     return melted;
   }   
   
   public boolean getempty()
   {
     return empty;    
   }
   
   public double getpercentQuantity()
   {
     return percentQuantity;
   }   
   
   public String toString()
   {
     return "This ice cream flavor : "+flavor+" has a cost of "+price+". The temperature at the moment of the ice cream is "+temp+
     ".The ice cream is "+melted+" snd "+empty+". Finally the percent quantity is "+percentQuantity;     
   }
   
   public void scoop(int num)
   {
     percentQuantity = percentQuantity - num *.01;
     if(percentQuantity < 0.2)
     {
       empty = true;    
     } 
     else
     {
       empty = false;    
     }
   }   
}
