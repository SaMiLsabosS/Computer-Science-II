
public class Dog
{
    private String name;
    private String color;
    private String dogBreed;
    private int age;
    
    public Dog()
    {
      name = "Jeff";
      color = "grey";
      dogBreed = "pug";
      age = 4;   
    }
    
    public Dog(String n, String c, String d, int a)
    {
      name = n;
      color = c;
      dogBreed = d;
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
    
    public String getDogBreed()
    {
      return dogBreed; 
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
    
    public void setDogBreed(String newDogBreed)
    {
      dogBreed = newDogBreed;  
    }
    
    public void setAge(int newAge)
    {
      age = newAge;  
    }
    
    public String isBarking()
    {
        return "BARK!";
    }
    
    public String toString()
    {
    return "My dog's name is "+name+", being a "+color+" "+dogBreed+", and he is " +age;
    }
}