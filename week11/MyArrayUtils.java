

// Fun with arrays and ArrayLists
// A set of CodingBat-styled functions
// to familiarize programmers with the
// use of these two data structures.

// Ethan Leifer
// November 2018

// 0. IMPORT STATEMENTS GO HERE
import java.util.Random;
import java.util.ArrayList;

public class MyArrayUtils
{
	/**
		generates an integer array of n-elements thatare randomly generated in the interval [min,max]
		precondition: n > 0

		@param n the desired length of the array
		@param min the minimum value that the array could hold
		@param max the maximum value that the array could hold
		@return an array of n random integers in the range [min,max]
	  */
	public static int[] generateList(int n, int min, int max)
	{
		// Create a random # Generator
		Random randGen = new Random();
		// intialize a new int to store a random number
		int x;
		// create an int[] at n length
		int[] arr = new int[n];
		// for each element in Array
		for (int i = 0; i < n-1; i++)
		{
			// Generate a random array in [min,max]
			x = randGen.nextInt(max-min);
			x += min;
			// store in the array
			arr[i] = x;
		}
		// return Array

		return arr;

	}

	/**
		returns true if arr contains target and false otherwise
		preconditiion: none

		@param target the value being sought
		@param arr the array being searched
		@return true if arr contains target and false otherwise
	  */
	public static boolean contains(int target, int[] arr)
	{
		// for each element in arr
		for (int i = 0; i < arr.length-1; i++)
		{
			// if target is = element
			if (target == arr[i])
			{
				//return true
				return true;
			}
		}
		//return false
		return false;
	}
	
	/**
		returns a String of length n consisting of n instances of String str
		precondition: none
		
		@param n the desired number of instances of str to add to the line
		@param str the String being concatenated n times
		@return a String consisting of n str's
	  */
	public static String line(int n, String str)
	{
		// intialize a new varible where all of the additions of str will be added
		String newStr = "";
		// go through n times and add str to the new string
		for (int i = 0; i <= n-1; i++) {
			newStr += str;
		}
		// return the string
		return newStr;
	}

	/**
		adds arr1 to arr2, in that order. Resulting array has length (arr1.length + arr2.length)
		precondition: both int[] have at least 1 element
	
		@param arr1 first array to be concatenated
		@param arr2 second array to be concatenated
		@return arr1 concatenated to arr2
	  */
	public static int[] concat(int[] arr1, int[] arr2)
	{
		// create a new int[] with the length of arr1 + arr2
		int[] arr3 = new int[arr1.length+arr2.length];
		// loop through the first set of elements (= to the length arr1)
		for (int i = 0; i < arr1.length; i++) 
		{
			// add the elements in arr1 to the new int[]
			arr3[i] += arr1[i];
		}
		// repeat for arr2 start at the length of arr1 + 1
		for (int i = arr1.length+1; i < (arr1.length + arr2.length); i++) 
		{
			arr3[i] += arr2[i-arr1.length];
		}
		
		// return the new array
		return arr3;
	}
	/**
		counts the number of times target occurs in arr and returns that count
		precondition: int[] has at least 1 element
		
		@param int value called target
		@param int[] called arr
		@return int that is the amt of times target occurs in arr
	*/
	public static int count(int target, int[] arr)
	{
		// create a varible called counter
		int counter = 0;
		// go through each value in arr
		for (int i = 0; i < arr.length; i++) 
		{
			//check if it is equal to target
			if (arr[i] == target)
				// if it is add 1
				counter ++;
		}
		// return counter
		return counter;
	}
	
	/**
		an ArrayList containing one copy of each distinct value that occurs in array arr. For instance, if arr consists of [2,1,1,2,2,3,4,5,5], the ArrayList returned would consist of [2,1,3,4,5]
		precondition: int[] has at least 1 element
		@param int[] called arr
		@return ArrayList<Integer>
		
	*/
	public static ArrayList<Integer> getDistinctValues(int[] arr)
	{
		// create a new int ArrayList
		ArrayList<Integer> distinctValues = new ArrayList<Integer>();

		// go through each value in arr
		for (int i = 0; i < arr.length; i++) 
		{
			// if that value is not in the array list 
			if (!distinctValues.contains(arr[i]))
			{
				// add it to the ArrayList
				distinctValues.add(arr[i]);
			}
		}
		//return the arrayList
		return distinctValues;
	}
	
	/**
		prints out a histogram of the values contained in arr, using asterisks as the indicators.
		precondition: int[] contains at least 1 element
		@param int[] called arr
	*/
	public static void printHistogram(int[] arr)
	{
		//intialize a String varible for the * in the table
		String asterisks = "";
				
		//prints the array at the top of the message correctly
		System.out.print("Array: ["); 
		for (int i = 0; i < arr.length-1; i++) 
		{
			System.out.print(arr[i]+ ",");
		}
		System.out.println(arr[arr.length-1] + "]");
		
		// prints the value and Frequency Labels + dashed lines
		System.out.println("Value  Frequency\n-----  ---------");
		
		// gets the Distinct Values
		ArrayList<Integer> distinctValues = getDistinctValues(arr);
		
		// goes through each Distinct Values and prints it with the amt of times it comes up
		for (int i = 0; i < distinctValues.size(); i++) 
		{
			//prints the distict Value
			System.out.print(distinctValues.get(i) + ":	");
			
			// counts the amt of the distiant value in the Array and turn that value into asterisks
			asterisks = line(count(distinctValues.get(i), arr),"*");
			
			//add the asterisks to the table
			System.out.print(asterisks + "\n");
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		//tester for generate method
		
		System.out.println("Tester for generate method:");
		System.out.print("Your 3 Random Numbers are: ");
		int[] arr1 = generateList(3, 0, 100);
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		//Tester for contains method
		System.out.println("\n\nTester for contains method:");
		System.out.print("the arr2 list contains 2: ");

		int[] arr2 = new int[5];
		for (int i = 0; i < 5; i++) {
			arr2[i] = i+1;
		}
		System.out.println(contains(2,arr2));
		
		
		// Tester for concat
		System.out.println("\nTester for concat method:");
		System.out.print("[1,2,3,4,5] + [6,7,8,9,10] = ");
		
		int[] arr3 = {1,2,3,4,5};
	
		int[] arr4 = {6,7,8,9,10};
		int[] arr5 = concat(arr3,arr4);
		for (int i = 0; i < 10; i++) 
			System.out.print(arr5[i]+ " ");

		
		
		// tester for line function
		System.out.println("\n\nTester for line method:");
		int n = 5;
		String str = "String";
		String newStr = line(n, str);
		System.out.println(str + " repeated " + n + " times: " + newStr);
		
		//tester for count function
		System.out.println("\nTester for count method:");
		int[] arr6 = {1,2,4,2,6,7,9,2,4}; // 3 2s
		int amt = count(2, arr6);
		System.out.println("There is " + amt + " of 2 in arr6");
		
		//tester for distiantvalues functions
		System.out.println("\nTester for distiantvalues method:");
		ArrayList<Integer> listOfDistinctValues = getDistinctValues(arr6);
	
		System.out.println(listOfDistinctValues); // should print 1,2,4,6,7,9
		
		System.out.println("\nTester for Histogram:");
		int[] arr7 = {1,1,3,2,4,4,2,5,-1,5,5,5};
		printHistogram(arr7); 
	}
}
