// Pennies.java

// Ethan Leifer
// October 8, 2018

/*
A. Prompts the user to enter a number of days worked.
B. If the number of days entered is less than 1, re-prompts the user to enter
a valid number of days, until he or she does so (valid here means greater
than or equal to 1 )
C. Prints out a tabular view of the salary earned each day
D. Prints out the total pay earned for all days worked
E. Computes and prints out the average daily wage
*/
import java.util.Scanner;
public class Pennies
{
  public static void main(String[] args)
  {
    // Varibles
    int daysWorked; // amt of days a person worked entered by user
    int daysWorkedLeft; // counter for while lop
    double payment = 1; //amt of pennies
    int counter = 0; // Counter for printing different days
    double salary; //Varible to calculate the salary of the person
    double totalPay = 0; //the total of your money
    double avgPay = 0; //Your avg wage

    // Takes user input for the amt of days worked
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Number of Days Worked: ");
    daysWorked = Integer.parseInt(keyboard.nextLine());

    // Sees if days worked is <= 0 and asks user to reenter days worked if < 0
    while (daysWorked < 1)
      {
      System.out.println("Your number is <= 0. Reenter PLS"); // Tells you that you enter in the wrong number
      System.out.print("Number of Days Worked: "); // Asks user again to enter in amt of days worked
      daysWorked = Integer.parseInt(keyboard.nextLine()); // resets the daysWorked varible
      }
    //makes daysWorkedLeft varible (THIS IS A COUNTER VARIBLE)
    daysWorkedLeft = daysWorked+1; //sets the daysWorked Counter
    System.out.println(""); //Gap Line
    System.out.println("Salary Earned Each Day"); //22 Characters
    System.out.println(""); // Gap line


    // MAKING THE TABLE

    //Creates the table varibles
    String day = "Day";
    String amt = "Amount($)";
    String dash12 = "------------";
    String dash3 = "---";


    // Creates the table format
    System.out.printf("%-12s %-12s\n",day,amt);
    System.out.printf("%-12s %-12s\n",dash3,dash12);

    // While loop to add items to table
    while (daysWorkedLeft > 1)
      {
        daysWorkedLeft--;
        counter++;
        totalPay+=payment/100; //adds up the total pay
        salary = payment/100;
        System.out.printf("%-12d %-12.2f\n",counter,salary); // prints salary with the day number
        payment = payment*2; //Calculates the amt of pennies gained for the next day
      }

    System.out.println(""); // Gap line
    // prints the total pay
    System.out.printf("Your total pay = $ %.2f", totalPay);

    System.out.println(""); // To go to the next line

    //Calculates and prints average pay
    avgPay = (totalPay)/daysWorked;
    System.out.printf("Your average daily wage = $%.2f", avgPay);
    System.out.println(""); //Another Gap line to move next terminal command to next line
  }
}
