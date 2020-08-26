// InputOutput.java

// Ethan Leifer
// 10/6/18

/*Algorithim:
  Create Scanner Object
  Take the two inputs from user cast them to ints
  Calculate final value by dividng days since birthday by Days per year
  Add that value to age
  Print value
*/
import java.util.Scanner;

public class InputOutput
{
  public static void main(String[] args)
  {
  // Constants and Varibles:
  final int DAYS_PER_YEAR = 365;
  int age;
  int daysSinceBirthday;
  double result;

  // Scanner Objects:
  Scanner keyboard = new Scanner(System.in);

  // User Enter age  + Save to age variable
  System.out.print("How old are you? ");
  age = Integer.parseInt(keyboard.nextLine()); // casts the String value of return into age varible

  // User Enter days since birthday + Save to daysSinceBirthday variable
  System.out.print("How many days since your birthday? ");
  daysSinceBirthday = Integer.parseInt(keyboard.nextLine()); // casts the String value of return into daySinceBirthday varible

  // Calculates the Final Value
  result = daysSinceBirthday*1.0/DAYS_PER_YEAR*1.0;
  result = result + age;

  // produce formatted output.
  System.out.printf("You are %d years old, or %.2f", age, result);
  
  }
}
