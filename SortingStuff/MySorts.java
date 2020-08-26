/**
	APCS sort implementations
	
	Includes public methods:
	
		a. bubble sort
		b. selection sort**
		c. insertion sort**
		d. merge sort**
		e. quick sort
		f. bogo (random) sort
		g. show - displays the array
		h. shuffle - shuffles the array
		i. reverse - reverses the array
		j. isSorted - returns true if array sorted ascending, false otherwise
		
	Includes private (helper) methods:
	
		 i. merge - used in merge sort
		ii. partition - used in quick sort
	   iii. less
	    iv. exch - swaps two elements in the array
		 v. getIntegerData - generates random list of Integer [m,M)
*/

import java.util.Random;

public class MySorts
{

	// implements classic bubble sort algorithm
	public static void bubbleSort(Comparable[] data)
	{
		// store the size of the data set
		int N = data.length;
		
		// madeSwap being false ends the sort
		boolean madeSwap = true;
		int numPasses = 0;
		
		while(madeSwap == true)
		{
			madeSwap = false; // reset for this pass
			for(int i = N-1; i > numPasses; i--)
			{
				if(less(data[i], data[i-1]))
				{
					exch(data,i,i-1);
					madeSwap = true;
				}
			}
			numPasses++;
		}

	}
	
	// implements classic selection sort algorithm
	public static void selectionSort(Comparable[] data)
	{
		// sort data into increasing order
		// store the length in N
		int N = data.length;
		for(int i = 0; i < N; i++)
		{
			// initialize min to the current position index
			int min = i;
			
			// find the index of the smallest element
			for(int j = i+1; j < N; j++)
			{
				if(less(data[j],data[min]))
					min = j;
			}
			
			// swap the min with the current position
			exch(data, i, min);
		}
	}
	
	// implements classic insertion sort algorithm
	public static void insertionSort(Comparable[] data)
	{
		// sort data into increasing order
		int N = data.length;
		for(int i = 1; i < N; i++)
		{
			// insert data[i] among data[i-1], data[i-2],...
			for(int j = i; j > 0 && less(data[j], data[j-1]); j--)
				exch(data, j, j-1);
		}
	}
	
	// implements classic merge sort algorithm
	public static void mergeSort(Comparable[] data)
	{ mergeSort(data, 0, data.length - 1); }
	
	public static void mergeSort(Comparable[] data, int lo, int hi)
	{
		if(hi <= lo)
			return; // already sorted
		int mid = lo + (hi - lo)/2;
		mergeSort(data, lo, mid);
		mergeSort(data, mid+1, hi);
		merge(data, lo, mid, hi);
	}
	
	// implements classic quicksort algorithm
	public static void quickSort(Comparable[] data)
	{
		shuffle(data); // remove any structure from the data
		quickSort(data, 0, data.length - 1);
	}
	
	public static void quickSort(Comparable[] data, int lo, int hi)
	{
		if(hi <= lo)
			return;
		int j = partition(data, lo, hi);
		quickSort(data, lo, j-1);
		quickSort(data, j+1, hi);
	}
	
	private static int partition(Comparable[] data, int lo, int hi)
	{
		// partition into data[lo..j-1], data[j],data[j+1..hi] and return j
		int i = lo, j = hi+1;    // left and right scan indices
		Comparable v = data[lo]; // partitioning item
		while(true)
		{
			while(less(data[++i], v))
			{
				if(i == hi)
					break;
			}
			while(less(v, data[--j]))
			{
				if(j == lo)
					break;
			}
			if(i >= j)
				break;
			exch(data,i,j);
		}
		exch(data,lo,j);
		return j;
	}
	
	private static void merge(Comparable[] data, int lo, int mid, int hi)
	{
		// merge data[lo...mid] with data[mid+1...hi]
		int i = lo, j = mid+1;
		
		// auxiliary array for the merge process
		Comparable[] aux = new Comparable[hi-lo+1];
		
		for(int k = lo; k <= hi; k++)
			aux[k-lo] = data[k];
		
		for(int k = lo; k <= hi; k++)
		{
			if(i > mid)
				data[k] = aux[j++-lo];
			else if(j > hi)
				data[k] = aux[i++-lo];
			else if(less(aux[j-lo],aux[i-lo]))
				data[k] = aux[j++-lo];
			else
				data[k] = aux[i++-lo];
		}
	}
	
	// implements classic bogo (random) sort algorithm
	// WARNING: do not use on arrays larger than, say, 7 or 8 elements!
	//          Will run a long time!!
	public static void bogoSort(Comparable[] data)
	{
		if(data.length < 8)
		{
			while(!isSorted(data))
				shuffle(data);
		}
	}
	
	// returns true if v < w, false otherwise
	private static boolean less(Comparable v, Comparable w)
	{ return v.compareTo(w) < 0; }
	
	// swaps locations of elements at indices i and j in array data
	private static void exch(Comparable[] data, int i, int j)
	{ 
		Comparable temp = data[i]; 
		data[i] = data[j]; 
		data[j] = temp; 
	}
	
	// displays the array (only use for smallish arrays)
	public static void show(Comparable[] data)
	{
		for(int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}
	
	// randomizes the array
	public static void shuffle(Comparable[] data)
	{
		// shuffles the array
		Random randGen = new Random();
		int N = data.length;
		
		for(int i = 0; i < N; i++)
		{
			int j = randGen.nextInt(N);
			exch(data, i, j);
		}
	}
	
	// generates and returns a random list of Integers of
	// length N in the range [m,M)
	public static Integer[] getIntegerData(int N, int m, int M)
	{
		Integer[] result = new Integer[N];
		Random randGen = new Random();
		
		for(int i = 0; i < N; i++)
		{
			result[i] = m + randGen.nextInt(M-m);
		}
		
		return result;
	}
	
	// reverses the order of the array
	public static void reverse(Comparable[] data)
	{
		int N = data.length;
		for(int i = 0; i < N/2; i++)
			exch(data, i, N-i-1);
	}
	
	// returns true if data in ascending order, false otherwise
	public static boolean isSorted(Comparable[] data)
	{
		for(int i = 1; i < data.length; i++)
			if(less(data[i], data[i-1])) return false;
		return true;
	}

}