// Import the Scanner Class to use
// for input from the keyboard
import java.util.Scanner;

public class Week5Topics
{
  public static void main(String[] args)
  {
    //To use a Scanneer object for keyboard input
    // 1. create a Scanner object
    Scanner keyboard = new Scanner(System.in);

    // 2. Create a String variable to store user's name.
    String name;

    // 3. Prompt user to enter their full name
    System.out.print("Please enter your full name: ");

    // 4. Use the appropriate Scanner method to get input
    name = keyboard.nextLine();

    // 5. print personalized greeting
    System.out.println("Hi there, " + name + ", how are you?");

    // 6. prompt user to enter age in years
    System.out.print("Please enter your age in years: ");

    // 7. Create an int varible to store age and get input from keyboard

    int age = keyboard.nextInt();

    //8. Print out final message
    System.out.println(name + " , you are " + age + " years old!");
  }
}
