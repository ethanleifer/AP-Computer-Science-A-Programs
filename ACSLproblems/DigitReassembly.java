import java.util.*;

// DigitReassembly.java


// By Ethan Leifer

// ACSL Problem 1
// This class completes the first ACSL problem (2018)
	// Given a number less than 1050 and a length n, starting on the left, form all non-overlapping n-digit numbers. If there are digits remaining on the right, add trailing zeros to ensure that the last number is n digits in length. Print the sum of all of the numbers formed.

// Imports:
import java.util.Scanner;

public class DigitReassembly 
{
	/**
		Takes the user input each time the while loop is ran.
		Precondition: None
		
		@param text used for the print statement to specify what the user should input
		@return The String of numbers or n value used in main()
	*/
	public static String userinputString(String text)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print(text);
		return keyboard.nextLine();
	}
	
	public static void main(String[] args) 
	{
	int counter = 0;
	
	while (counter < 5) 
	{
	
		String numberinString = userinputString("Enter the Integer: ");
		int n = Integer.parseInt(userinputString("Enter the N Value: "));

		// create an arrayList to store the new varibles
		ArrayList<String> splitNumbersString = new ArrayList<String>();
		// varible to store the current charaters in each element
		String store = "";
		// to keep track of how long each element is
		int currentN = n;
		// the amt of zeros have to add
		int leftover = n-numberinString.length()%n; // the amt of zeros you have to add

		//adds all of the elements at n length to the arrayList
		for (int i = 0; i < numberinString.length(); i++)
		 {
			//adds the current element in the string to the current element in the list
			store +=numberinString.charAt(i);
			// subtract one from the current n cause you added an element to the list
			currentN--;
			
			// once the element is the right size add it to the list and reset all varibles
			if (currentN == 0)
			{
				splitNumbersString.add(store);
				currentN = n;
				store = "";
			}
		}
		//adds the amt of zeros required
		String zeros = store;

		//the leftover is the amt of zeros you have to add from above
		for (int i = 0; i < leftover; i++) 
		{zeros += "0";}		
		
		//adds the final element (the store that is leftover from the previous for loop which is whatever charaters are leftover) + the amt of zeros
		splitNumbersString.add(zeros);
		
		//prints the list
		for (int z= 0; z < splitNumbersString.size(); z++) 
		{System.out.println(splitNumbersString.get(z));}
		System.out.println(splitNumbersString);
		System.out.println("\n\n\n");
		//calculates the sum
		int sum = 0;
		String currentNumber = "";
		for (int i = 0; i < splitNumbersString.size(); i++)
		{
			sum += Integer.valueOf(splitNumbersString.get(i));
			System.out.println(currentNumber);
		}
		System.out.println("Sum: " + sum);
		}
		counter++;
	}
}
	