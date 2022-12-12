import static java.lang.System.*;
public class TenToAny
{
   private int base10;
   private int newBase;
    public TenToAny()
   {
     base10 = 0;
     newBase = 0;
   } 
    public TenToAny(int num, int base)
   {       
     setNewNum(num,base);   
   }
    public void setNewNum(int num, int base)
   {
     base10 = num;
     newBase = base;
   }
    public String getNewNum()
   {
     String newNum = "";
     String ans = "";
     int rem = 0;
     while(base10 > 0)
     {
       rem = base10 % newBase;
       if(rem == 10)
         newNum += "A";
       else if(rem == 11)
         newNum += "B";
       else if(rem == 12)
         newNum += "C";
       else if(rem == 13)
         newNum += "D";
       else if(rem == 14)
         newNum += "E";
       else if(rem == 15)
         newNum += "F";
       else
         newNum += rem;
       base10 /= newBase;
     }
     for(int i = newNum.length()-1; i > -1; i--)
     {
         ans += newNum.substring(i, i + 1);
     }  
     newNum = ans;
     return newNum;
   }
   public String toString()
   {
     return base10+" base 10 is "+getNewNum()+" in base "+newBase+"\n";
   }
}
