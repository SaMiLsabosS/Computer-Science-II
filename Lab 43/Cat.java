
public class Cat
{
    private String name;
    private String color;
    private String catBreed;
    private int age;
    
    public Cat()
    {
      name = "Henry";
      color = "grey";
      catBreed = "persian";
      age = 3;   
    }
    
    public Cat(String n, String c, String cA, int a)
    {
      name = n;
      color = c;
      catBreed = cA;
      age = a;   
    }
    
    public String getName()
    {
      return name;  
    }
    
    public String getColor()
    {
      return color;
    }
    
    public String getCatBreed()
    {
      return catBreed; 
    }
    
    public int getAge()
    {
      return age; 
    }
    
    public void setName(String newName)
    {
      name = newName; 
    }
    
    public void setColor(String newColor)
    {
      color = newColor;
    }
    
    public void setCatBreed(String newCatBreed)
    {
      catBreed = newCatBreed;  
    }
    
    public void setAge(int newAge)
    {
      age = newAge;  
    }
    
    public String isPurring()
    {
        return "PURR!";
    }
    
    public String toString()
    {
    return "My cat's name is "+name+", being a "+color+" "+catBreed+" cat, and he is " +age;
   }
}