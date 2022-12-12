public class Discount
{
    private double oriBill, finalBill;
    // Constructors
    public Discount()
    {
     setFinallBill(0);
     finalBill = 0;
    }
    public Discount( double a)
    {
       setFinallBill(a);
       finalBill = 0;
    }
    // modifiers
    public void setFinallBill(double ac)
    {
       oriBill  = ac;
            }
    // behaviors 
    public void calcBill()
    {
         if(oriBill >= 2000){
       double ab = oriBill*.15; 
       finalBill = oriBill- ab;
           }
    else
    {
      finalBill = oriBill + 0; 
        
    }
    }
    public void print()
    {
       System.out.println("Bill after discount :: " +String.format("%.2f\n",finalBill ));
    }
}