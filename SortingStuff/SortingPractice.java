import java.nio.channels.*;

// SortingPractice.java

// Ethan Leifer


public class SortingPractice {
	
	public static void main(String[] args) 
	{
		
	Integer[] nums = MySorts.getIntegerData(10000,-100,100);
	

	int amtofiterations = 10;
	
	//the lists to hold the times of each sort
	double[] bubbleSortList = new double[amtofiterations];
	double[] selectionSortList = new double[amtofiterations];
	double[] insertionSortList = new double[amtofiterations];
	double[] mergeSortList = new double[amtofiterations];
	double[] quickSortList = new double[amtofiterations];
	
	double time;
	StopWatch timer= new StopWatch();
	for (int i = 0; i < amtofiterations; i++) {
		
		//bubble sort
		MySorts.bubbleSort(nums);
		bubbleSortList[i] = timer.elapsedTime();
		MySorts.shuffle(nums);
		
		//selection sort
		MySorts.selectionSort(nums);
		selectionSortList[i] = timer.elapsedTime();
		MySorts.shuffle(nums);
		
		// insertion sort
		MySorts.insertionSort(nums);
		insertionSortList[i] = timer.elapsedTime();
		MySorts.shuffle(nums);
		
		// merge sort
		MySorts.mergeSort(nums);
		mergeSortList[i] = timer.elapsedTime();
		MySorts.shuffle(nums);
		
		// quick sort
		MySorts.quickSort(nums);
		quickSortList[i] = timer.elapsedTime();
		MySorts.shuffle(nums);
	}
	
	double avg = 0;
	double[] avgTimes = new double[5];
	
	for (int i = 0; i < amtofiterations; i++) {
		avg+=bubbleSortList[i];
	}
	avg = avg/amtofiterations;
	avgTimes[0] = avg;
	
	
	for (int i = 0; i < amtofiterations; i++) {
		avg+=selectionSortList[i];
	}
	avg = avg/amtofiterations;
	avgTimes[1] = avg;
	
	
	for (int i = 0; i < amtofiterations; i++) {
		avg+=insertionSortList[i];
	}
	avg = avg/amtofiterations;
	avgTimes[2] = avg;
	
	
	for (int i = 0; i < amtofiterations; i++) {
		avg+=mergeSortList[i];	
	}
	avg = avg/amtofiterations;
	avgTimes[3] = avg;
	
	
	for (int i = 0; i < amtofiterations; i++) {
		avg+=quickSortList[i];
	}
	avg = avg/amtofiterations;
	avgTimes[4] = avg;
	
	for (int i = 0; i < amtofiterations; i++)
		System.out.print(bubbleSortList[i] + "\t");
	System.out.printf("\nBubble Sort took %.5f\n",avgTimes[0]);
	
	for (int i = 0; i < amtofiterations; i++) 
		System.out.print(selectionSortList[i] + "\t");	
	System.out.printf("\nSelection Sort took %.5f\n",avgTimes[1]);
	
	for (int i = 0; i < amtofiterations; i++) 
		System.out.print(insertionSortList[i] + "\t");	
	System.out.printf("\nInsertion Sort took %.5f\n",avgTimes[2]);
	
	for (int i = 0; i < amtofiterations; i++) 
		System.out.print(mergeSortList[i] + "\t");
	System.out.printf("\nMerge Sort took %.5f\n",avgTimes[3]);
	
	for (int i = 0; i < amtofiterations; i++) 
		System.out.print(quickSortList[i] + "\t");
	System.out.printf("\nQuick Sort took %.5f\n",avgTimes[4]);
}
	
	
	
}