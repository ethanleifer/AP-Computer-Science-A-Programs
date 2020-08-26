// .java

// APCS
// imports
import java.util.Random;
import java.util.*;

class TwoDArrayIntro 
{
	public static void main(String[] args) 
	{
		int size = 5;
		int[][] m1 = getRandomMatrix(size, size, 10000);
		System.out.println("The Diagonal Sum = " + sumDiagonal(m1));
		System.out.println("The Average Value = " + getAverage(m1));
		System.out.println("Does matrix contain 2046 = " + contains(m1,2046));
		System.out.println("The max value = " + getMaximum(m1));
		System.out.println("Does the Diagonal Rise = " + risingDiagonal(m1));
		displayMatrix(m1);
	}
	
	public static int sumDiagonal(int[][] m)
	{
		// returns the sum of the elements on m's main diagonal
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	
	public static double getAverage(int[][] m)
	{
		// amt of elements
		int amt = 0;
		
		// total value
		double total = 0;
		
		//goes through each value and adds it to total and adds each element to amt
		for (int row = 0; row < m.length; row++) 
		{
			for (int col = 0; col < m[row].length; col++) 
			{
				amt++;
				total+= m[row][col];
			}
		}
		//calculate and return avg
		double avg = total/amt;
		return avg;

	}
	
	public static void displayMatrix(int[][] m)
	{
		for (int row = 0; row < m.length; row++) 
		{
			for (int col = 0; col < m[row].length; col++) 
			{
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] getRandomMatrix(int numRows, int numCols, int max)
	{
		Random rand = new Random(1);
		
		int[][] result = new int[numRows][numCols];
		
		for (int row = 0; row < result.length; row++) 
		{
			for (int col = 0; col < result[row].length; col++) 
			{
				result[row][col] = rand.nextInt(max+1);
			}
		}
		return result;

	}
	
	//HW additions for 1/9
	
	public static boolean contains(int[][] m,int target)
	{
		for (int row = 0; row < m.length; row++) 
		{
			for (int col = 0; col < m[row].length; col++) 
			{
				if (m[row][col] == target)
					return true;
			}
		}
		return false;
	}
	
	public static int getMaximum(int[][] m)
	{
		int maxValue = m[0][0];
		for (int row = 0; row < m.length; row++) 
		{
			for (int col = 0; col < m[row].length; col++) 
			{
				if (maxValue < m[row][col])
					maxValue = m[row][col];
			}
		}
		return maxValue;
	}
	
	public static boolean risingDiagonal(int[][] m)
	{
		for (int i = 1; i < m.length; i++) 
		{
			if (m[i-1][i-1] > m[i][i])
				return false;
		}
		return true;

	}
	
	public static int[][] highPass(int[][] mat,int minValue)
	{
		int[][] result = new int[mat.length][mat[0].length];
		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; r < mat[r].length; c++)
			{
				if(mat[r][c] < minValue)
					result[r][c] = minValue;
				else
					result[r][c] = mat[r][c];
			}
		}
		return result;
	}
	
	public static getBinary(int num)
	{
		String result = "";
		int remainder = 0;
		ArrayList<Integer> remainders  = new ArrayList<Integer>();
		
		while (num > 1) {
			remainders.		
		}
	
}