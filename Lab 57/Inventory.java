import java.util.Arrays;
import java.util.*;
import static java.lang.System.*;
public class Inventory
{
    //instance variables
    private Book[] books; // declare array varaible objects //
    private int numBooks; // logical size of array     
    public static void main(String[] args)
    {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
    //constructor
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }
    
      /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks()
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("***********************");
        out.println("*    addBooks    *");
        out.println("***********************");
        numBooks = 0;
        String answer = "y";
        while(answer.equals("y"))
        {
            out.print("Student Name ---> ");
            String name = keyboard.nextLine();
            out.print("Book Number ---> ");
            int number = keyboard.nextInt();           
            books[numBooks] = new Book(name, number);
            numBooks++; 
            keyboard.nextLine();
            out.print("\nEnter another student and book?(y/n) --> ");
            answer = keyboard.nextLine(); 
        }
    }    
    
    /* This method displays the student name and book number for each 
     * Book in the array.
     */
    public void printBooks()
    {
       out.println("************************");
       out.println("*    printBooks  *");
       out.println("************************");     
       for(int i=0; i<books.length; i++)
       {
           if(!(books[i] == null))
            {
                out.println(books[i]);
                out.print("\n");
            }           
       }
    }
}