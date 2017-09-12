
/**
 * Question C6 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class C6 {
	
	/**
	 * invoke the minValueIndex method multiple times and note the timings
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create arrays
		//first array is fake to stop disrupting results
		//as the first array irregularly take longer
		int[] arrayFakeFirst = new int[1000000];
		int[] array1 = new int[1000000];
		int[] array2 = new int[2000000];
		int[] array3 = new int[3000000];
		int[] array4 = new int[4000000];
		int[] array5 = new int[5000000];
		int[] array6 = new int[6000000];
		int[] array7 = new int[7000000];
		int[] array8 = new int[8000000];
		int[] array9 = new int[9000000];
		int[] array10 = new int[10000000];
		
		//create multidimensional array to hold all arrays
		int[][] arrays = { arrayFakeFirst, array1, array2, array3, array4, array5, array6, array7, array8, array9, array10 };
		
		//loop though all arrays
		for(int j = 0; j < arrays.length; j++){
			
			double duration = 0;
			//run the same array 5 iterations to get an average time
			for(int i = 0; i < 5; i++){
				
				long start = System.currentTimeMillis();
				minValueIndex(arrays[j], arrays[j].length);
				long end = System.currentTimeMillis();
				duration += end - start;
				
			}
			//get average timing
			duration = duration / 5;
			System.out.println("Array Size: " + arrays[j].length + " || Running Time = " + duration);
		}
	}
	
	/**
	 * A method which find the index of the smallest value in an array
	 * @param array
	 * @param n - size of array
	 * @return index of the smallest value in the array
	 */
	public static int minValueIndex(int array [], int n) {
		int minVlaueIndex = 0;
		
		for(int k = 1; k <= n-1; k++){
			if(array[minVlaueIndex] > array[k])
			{
				minVlaueIndex = k;
			}
		}
		return minVlaueIndex;
		
	}
}
