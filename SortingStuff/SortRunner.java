// SortRunner.java




public class SortRunner 
{
	public static void main(String[] args) 
	{
	
		int n = 10000;
		Integer[] a = MySorts.getIntegerData(n, -10, 10);
		
		StopWatch timer= new StopWatch();
		MySorts.quickSort(a);
		double time = timer.elapsedTime();
		
		if (MySorts.isSorted(a))
			System.out.printf("sort took %.5f seconds to sort %d items\n", time, n);
		else
			System.out.println("ERROR: array was not sorted properly.");
		
	}
}