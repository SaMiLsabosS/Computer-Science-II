
public class PepperPlant
{
    private int plantMat;
    private int fruitMat;
    private double height;
    private int waterLevel;
    private int nitroLevel;
    private int fruitNum;
    private String fruitColor;
    public PepperPlant()
    {
       plantMat = 5;
       fruitMat = 0;
       height = 5.0;
       waterLevel = 4;
       nitroLevel = 4;
       fruitNum = 0;
       fruitColor = "no pepper yet";       
    }
    public PepperPlant(int p, int fM, double h, int w, int n, int fN, String fC)
    {
       plantMat = p;
       fruitMat = fM;
       height = h;
       waterLevel = w;
       nitroLevel = n;
       fruitNum = fN;
       fruitColor = fC;       
    }
    public void getName()
    {
        String[] pepperName = {"Jalapeno", "Serrano", "Habanero", "Pabloano", "Pimento"};
        pepperName[0] = 
        return pepperName;
    }       
    public String toString()
    {
       return "Plant Maturity: "+plantMat+"\nFruit Maturity: "+fruitMat+"\nHeight: "+height+"\nWater Level: "+waterLevel+"\nNitro Level: "+nitroLevel+"\nFruit Number: "+fruitNum+"\nFruit Color: "+fruitColor;
    }
}
