// FunNumberTester.java

//  method is in FunNumber.java class

//Ethan Leifer
// October 15, 2018

// Imports:
import java.util.Scanner;

public class FunNumberTester
{
  public static void main(String[] args)
  {
    /*
    int amtOfPerfectNumbers = 0; //4 less than 25000
    int amtOfAbundantNumbers = 0;
    int amtOfDeficientNumbers = 0;
    int amtLessThan = 25000;
    for(int i = 1; i<amtLessThan;i++)
    {
      if(FunNumber.isPerfect(i))
      {
        amtOfPerfectNumbers +=1;
      }
      if(FunNumber.isAbundant(i))
      {
        amtOfAbundantNumbers +=1;
      }
      if(FunNumber.isDeficient(i))
      {
        amtOfDeficientNumbers+=1;
      }
    }
    System.out.println("The amount of Perfect numbers less than "  + amtLessThan + " is " + amtOfPerfectNumbers);
    System.out.println("The amount of Abundant numbers less than "  + amtLessThan + " is " + amtOfAbundantNumbers);
    System.out.println("The amount of Perfect numbers less than "  + amtLessThan + " is " + amtOfDeficientNumbers);
    */

     Scanner keyboard = new Scanner(System.in);
     int num;
     do
     {

       System.out.print("Please enter a positve whole number (negative to quit): ");
       num = keyboard.nextInt();
       if (num > 0)
       {
         int result = FunNumber.sumDigits(num);
         System.out.println(result);

         /*
         if(FunNumber.isDigits(num))
          {
           System.out.println(num + " is a perfect square. ");
         }
         else
         {
           System.out.println(num + " is NOT a perfect square. ");
         }*/
       }
     } while(num > 0);

     System.out.println("Good-bye!");
    
  }
  
}
