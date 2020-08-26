// Quadratic.java by JSI
// main class provided for APCS
// programming assignment #3 2018
// students provide all functions in separate
// class QuadraticFunctions.java

public class Quadratic
{
	public static void main(String[] args)
	{

		// define the yes or no options,
		// set again to "y" in order to enter while loop
		String[] options = {"y","n"};
		String again = "y";

		// main loop
		while(again.equalsIgnoreCase("y"))
		{
			// array to hole coefficients A, B, and C
			// defining y = Ax^2 + Bx + C
			double[] coeffs = new double[3];

			// get coefficients from the user
			coeffs = QuadraticFunctions.getCoefficients();

			// compute the two forms of the equation
			String generalForm = QuadraticFunctions.toString(coeffs,"general");
			String factoredForm = QuadraticFunctions.toString(coeffs,"factored");

			// display the two forms
			System.out.printf("\nGeneral Form of Quadratic: \t%-20s\n", generalForm);
			System.out.printf("Factored Form of Quadratic: \t%-20s\n", factoredForm);

			// see is user wishes to go again
			System.out.println("\nDo you wish to try again? (y or n)");
			again = QuadraticFunctions.chooseBetween(options);
		}

		// adios
		System.out.println("Bye Bye!");

	}
}
