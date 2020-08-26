
class QuadraticTester {
	public static void main(String[] args) {
		double[] coeffs = new double[3];
		
		// get coefficients from the user
		coeffs = QuadraticFunctions.getCoefficients();
		//System.out.println(coeffs[0]);
		//System.out.println(coeffs[1]);
		//System.out.println(coeffs[2]); 
		
		System.out.println(QuadraticFunctions.toString(coeffs, "general"));
	}
}