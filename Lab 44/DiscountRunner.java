import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math.*;
public class DiscountRunner extends Discount
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the original bill amount :: ");
    double oriBill = keyboard.nextDouble(); 
    Discount test = new Discount();
    test.setFinallBill(oriBill);
    test.calcBill();
    test.print();
    System.out.print("Enter the original bill amount :: ");
    double oriBills = keyboard.nextDouble(); 
    Discount testtwo = new Discount();
    testtwo.setFinallBill(oriBills);
    testtwo.calcBill();
    testtwo.print();
    System.out.print("Enter the original bill amount :: ");
    double oriBillss = keyboard.nextDouble(); 
    Discount testthree = new Discount();
    testthree.setFinallBill(oriBillss);
    testthree.calcBill();
    testthree.print();
    System.out.print("Enter the original bill amount :: ");
    double oriBille = keyboard.nextDouble();   
    Discount testfour = new Discount();
    testfour.setFinallBill(oriBille);
    testfour.calcBill();
    testfour.print();
    System.out.print("Enter the original bill amount :: ");
    double oriBilles = keyboard.nextDouble(); 
    Discount testfive = new Discount();
    testfive.setFinallBill(oriBilles);
    testfive.calcBill();
    testfive.print();
  }
}
