public class MyRectangle
{
 // instance variables
   private int length;     // rectangle's length
   private int width;      // rectangle's width
 // constructor
 public MyRectangle()
 {
  length = 8;
  width = 5;
 }
 // accessor methods
  public int getLength()
 {
   return length;
 }
 public int getWidth()
 {
   return width;
 }
 // mutator methods
 public void setLength(int l)
 {
   length = l;
 }
 public void setWidth(int w)
 {
   width = w;
 }
 // other methods
 public int getPerimeter()
 {
         return 2*(length+width);
 }
 public int getArea()
 {
        return width * length;
 }
 public String toString()
 {
    return "Length = " + length +"\n" + "Width = " + width +"\n" + "Perimeter = " + 2*(length+width) +"\n" + "Area = " + width * length;   
 }  
}