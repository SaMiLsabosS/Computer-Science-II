import java.util.Scanner;

public class ScannerExamples
{
   public static void main(String []arqs)
   {
    Scanner keyboard = new Scanner(System.in);
    /*int num1,num2;
    System.out.print("Enter First Number: ");
    num1=keyboard.nextInt();
    System.out.print("Enter Second Number: ");
    num2=keyboard.nextInt();
    System.out.println("Number 1 is = " + num1);
    System.out.println("Number 2 is = " + num2);
    System.out.print("Enter a Decimal Number: ");
    double num3 = keyboard.nextDouble();
    System.out.println("Decimal Number is = " + num3);
    */
    System.out.println("Enter a word: ");
    String word1 = keyboard.next();
    keyboard.nextLine();
    System.out.println("Enter a sentence: ");
    String sentence = keyboard.nextLine();
    System.out.println(" Word = " + word1);
    System.out.println(" Sentence = " + sentence);   
   }
}
