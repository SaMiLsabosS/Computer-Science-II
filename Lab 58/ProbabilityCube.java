public class ProbabilityCube
{
    private String color;
    private int numFaces;
    private int faceValue;
    public ProbabilityCube()
    {
        color = "green";
        numFaces = 0;
        faceValue = 0;     
    }
    
    public ProbabilityCube(String c, int num,int f )
    {
       color = c;
       numFaces = num;
       faceValue = f;
    }
   
    public void setColor(String c)
    {
        color = c;
    }
   
    public void setNumFaces(int num)
    {
        numFaces = num;
    }
   
    public void setFaceValue(int f)
    {
        faceValue = f;
    }
 
    public String getColor()
    {
        return color;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
   
    public int getNumFaces()
    {
        return numFaces;
    }
   
    public void roll()
    { 
        faceValue = (int)(Math.random() * numFaces) + 1;
    }
    
    public String toString()
    {
        return "My cube is " + color + " with # of faces  " + numFaces;
    }  
}
