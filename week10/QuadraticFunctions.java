// QuadraticFunctions.java

// Ethan Leifer
// November 2018

// APCS: Project 1



// imports:
import java.util.Scanner;

public class QuadraticFunctions {


	/**
	Asks the user to input a value from the list given as input, and repeats until they acquiesce.
	Precondition: At least one item in the array
	@param String containing at least one string
	@return String that is guaranteed to be equal to one of the items in the input array
	*/
	public static String chooseBetween(String[] options)
	{
		// 1. Create a counter varible = to the length of options -1
		int counter = options.length-1;

		// 2. Create a userinput String varible to add the user input to
		String userinput = "";

		// 3. Create a String varible for to put all of the items in options into
		String strOflist = " ";

		// 4. Create a Scanner obj
		Scanner keyboard = new Scanner(System.in);

		// 5. Add all of the items to a str (strOfList)

		// 5a. Loop through all of the items in options user the counter varible
		while (counter >= 0)
		{
			// 5b. add each item to the string
			strOflist +=options[counter] + " ";

			// 5c. subtract one from counter
			counter--;
		}

		// 6. reset the counter = 1.
		counter = 1;

		// 7. Take user input and see if it is equal to an item in options

		// 6a. Using the reset counter varible create a while loop that loops through the values until the userinput is equal to a value in options
		while (counter > 0)

		{
			// 6b Take user input and assign it to a varible (userinput)
			System.out.print("Please enter one of ["+ strOflist + "]: ");
			userinput = keyboard.nextLine();

			// 6c. check if value is equal to an element in options

			// 6ca. loop through all values in options
			for(int i = 0;i<=options.length-1;i++)
			{
				// 6cb. Check if the index from the loop is equal to the value of userinput
				if (userinput.equals(options[i]))
					// 6cc.  if true end the while loop (lower the counter by 1)
					counter--;
			}
		}
		// 7. Return userinput
		return userinput;

	}


	/**
	prompts the user to enter A,B, and C, forcing them to enter a non-zero value for A (no restrictions on B or C), places them in an array of doubles, then returns that array
	Precondition: None
	@return double[] of 3 doubles (a,b,c)
	*/
	public static double[] getCoefficients()
	{
		// 1. Creates the Scanner Item
		Scanner keyboard = new Scanner(System.in);

		// 2. intializes double array to be returned with a,b,c values
		double[] coefficients = new double[3];

		// 3. creates the a varible with user input
		System.out.print("Please enter a non-zero value for A: ");
		double a = keyboard.nextDouble();

		// 4. Checks if a is == to 0
		while (a==0)
		{
			// 4b. resigns the a varible (a)
			System.out.print("Please enter a non-zero value for A: ");
			a = keyboard.nextDouble();
		}

		// 5. creates an b value and assigns it to a varible (b)
		System.out.print("Please enter a value for B: ");
		double b = keyboard.nextDouble();

		// 6. creates an assigns the c value and assigns it to a varible (c)
		System.out.print("Please enter a value for C: ");
		double c = keyboard.nextDouble();

		// 7. assigns double varibles to the correct array placement (order = [a,b,c])

		// 7a. A value
		coefficients[0] = a;

		// 7b. B value
		coefficients[1] = b;

		// 7c. C value
		coefficients[2] = c;

		//8. return coefficent array
		return coefficients;
	}


	/**
	computes and returns the discriminant of a quadratic equation.
	precondition: None
	@param double[] containing 3 doubles (a,b,c (in that order) )
	@return double (the discriminant)
	*/
	public static double getDiscrimant(double[] coefficients)
	{
		//CHANGE SO ITS GENERAL
		// 1. initionalize and assign coefficient array list to varibles

			// 1a. a value
			double a = coefficients[0];

			// 1b. b value
			double b = coefficients[1];

			// 1c. c value
			double c = coefficients[2];

		// 2. solve for the discriminat (by computing b^2 - 4ac)
		double discriminant = Math.pow(b, 2) - 4*a*c;

		// 3. return value
		return discriminant;
	}

	/**
	computes and return the real roots of a quadratic equation.
	Precondition: dsicriminat => 0
	@param double[] containing 3 doubles (a,b,c (in that order) )
	@return double[]  containing two roots
	*/
	public static double[] getRoots(double[] coefficients)
	{
		// 1. initionalize and assign coefficient array list to varibles

			// 1a. a value
			double a = coefficients[0];

			// 1b. b value
			double b = coefficients[1];

			// 1c. c value
			double c = coefficients[2];

		// 2. call a function to create a discrimant number
		double d = getDiscrimant(coefficients);
		// 3. finds the first real root
		double r1 = (-b+Math.sqrt(d))/(2*a);
		// 4. finds the second real root
		double r2 = (-b-Math.sqrt(d))/(2*a);

		// 6. initialize a new list with a length of two for the two r values
		double[] roots = new double[2];

		// 7a. assign the r1 values to the roots values
		roots[0] = r1;
		// 7b. do it again for the r2 value
		roots[1] = r2;
		// 8. return roots array
		return roots;
	}

	/**
	creates a String representation of the quadratic repre- sented by the input coefficients, in either general or factored form. If discriminant is negative and desired form is factored, then returns “NA”.
	@param double[] containing 3 doubles (A, B, and C in that order), and a String that will be either “general” or “factored”
	@return String containing either the general or the factored form of the quadratic
	*/
	public static String toString(double[] coefficients, String form)
	{
		//1. intializes varibles and run functions that are needed to put the varibles into the right form

		//1a. roots
		double[] roots = new double[2];
		roots = getRoots(coefficients);

		//1b. Discrimant
		double d = getDiscrimant(coefficients);

		//1c.
		double a = coefficients[0];
		double b = coefficients[1];
		double c = coefficients[2];

		//2. Intialize a return value
		String returnvalue = "";



		// 3. check if factored is == to "factored" and if the descriminant == 0
		if (form.equals("factored") && (d == 0))
		{
			// 3b. return "NA"
			return "NA";
		}
		// 4. Check if factored is == to "factored"
		else if (form.equals("factored"))
		{
			// 4. put the equation into factored form

			// 4a. check if the d is greater
			if (d>0)
			{
				// 4aa. A COEFFICENT

				//Checking the a coefficient

				// If the a coefficients is equal to anything other than 1 or -1 then put the a value in the equation
				if (a!=1 && a!=-1)
				{
					returnvalue = String.format("y = %.2f(x",a);
				}
				// For anything that doesnt fit the first do not include the a coefficent
				else
				{
					returnvalue = "y = (x";
				}

				// 4ab. FIRST ROOT

				// 4aba. Check if the root value is greater than 0 use a + sign before the first root value
				if (roots[0]>0)
					{
					returnvalue += String.format( " + %.2f) (x",roots[0]);
					}
				// 4abb. Check if the root value is less than 0 use a - sign before the first root value
				else
				{
					returnvalue += String.format(" - %.2f) (x",Math.abs(roots[0]));
				}


				// 4ac. SECOND ROOT (Same as first root value)

				//4aca. Check if the root value is greater than 0 use a + sign before the second root value
				if (roots[1]>0)
				{
					returnvalue += String.format(" + %.2f)",roots[1]);
				}
				//Check if the root value is less than 0 use a - sign before the first root value
				else
				{
					returnvalue += String.format(" + %.2f)", roots[1]);
				}
			}


			// 4ab. If the discriminat is less than 0 return "NA"
			else
			{
				return "NA";
			}
		}


		// 5. putting the equation into general form
		else
		{

			// 5a. A VALUE

			// 5aa. if a equals 1 you do not show the x coefficent
			if (a == 1)
			{
				returnvalue = "y = x^2";
			}

			// 5ab. if the x cofficent is equal to -1 you do not show the 1 so the x coefficient is just -
			else if (a == -1)
			{
				returnvalue = "y = -x^2";
			}
			// 5ac. has any other value (you do not have to account for 0 because a cannot be 0)
			else
			{
				returnvalue = String.format("y = %.2fx^2",a);
			}

			// 5b. B VALUE

			// 5ba. check if b is not equal to 0 (if b is equal to 0 you do not show anything)

			if (b != 0)
			{
				// 5bb. to simply the conditiional above you also do not show anything if the b value is = to 1 or -1
				if (b == 1 || b == -1)
				{}
				// 5bc. if b is greater than 0 you add "+" and the b value to the returnvalue
				else if (b > 0)
				{
					returnvalue += String.format( " + %.2fx",b);
				}
				// 5bd. if b is less than = you add "-" and the abs of the b value to the return value (you have to do abs because you can have a double negative)
				else if (b<0)
				{
					returnvalue += String.format( " - %.2fx",Math.abs(b));
				}
			}

			// 5c. C VALUE

			// 5ca. check if c is not = to 0 (if c is equal to 0 you do not show anything)
			if (c!=0)
			{
				// 5cb. if c is greater than 0 add "+"
				if (c>0)
				{
					returnvalue += " + ";
				}
				// 5cc. if c is less than 0 add "-"
				else
				{
					returnvalue += " - ";
				}
				// 5cd. add the abs of the c value
				returnvalue +=String.format("%.2f",Math.abs(c));
			}
		}

		// 6. return the form
		return returnvalue;
		}
}
