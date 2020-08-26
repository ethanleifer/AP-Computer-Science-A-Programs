

// filename




class SortingPractice2 {
	public static void main(String[] args) {
		Integer[] nums = MySorts.getIntegerData(10000, -100, 100);
		
	int amtofiterations = 100;
		
	double time=0;
	StopWatch timer = new StopWatch();
	for (int i = 0; i < amtofiterations; i++) {
		MySorts.quickSort(nums);
		time+=timer.elapsedTime();
		MySorts.shuffle(nums);
		
	}
	double avg = time/amtofiterations;
	System.out.printf("Quicksort took: %.5d",avg);
	
	time=0;
	for (int i = 0; i < amtofiterations; i++) {
		MySorts.mergeSort(nums);
		time+=timer.elapsedTime();
		MySorts.shuffle(nums);
		
	}
	avg = time/amtofiterations;
	System.out.printf("MergeSort took: %.5d",avg);
	}
}