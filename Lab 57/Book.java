public class Book
{
    // instance variables
    String studentName = "";
    int bookNumber = 0;
    // constructors
    public Book()
    {
        studentName = "";
        bookNumber = 0;
    }
    
    public Book(String s, int b)
    {
        studentName = s;
        bookNumber = b;
    }
    
    // accessor and modifiers methods
    public String getstudentName()
    {
        return studentName;
    }
    
    public int getbookNumber()
    {
        return bookNumber;
    }
    
    public void setstudentName(String s)
    {
        studentName = s;
    }
    
    public void setbookNumber(int b)
    {
        bookNumber = b;
    }
    // toString method
    public String toString()
    {
       return "Student's name is " + studentName  + "\nBook number is " + bookNumber;    
    }
}
