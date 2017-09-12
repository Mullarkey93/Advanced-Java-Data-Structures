
/**
 * Question C10 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class C10 {

	/**
	 * invoke the linearSearch method multiple and note the timings
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create arrays
		//first array is fake to stop disrupting results
		//as the first array irregularly takes longer
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
		
		//loop through all arrays
		for(int j = 0; j< arrays.length; j++){
			
			double duration = 0;
			//run the same array 5 iterations to get an average time
			for(int i = 0; i < 5; i++){
				
				long start = System.currentTimeMillis();
				linearSearch(arrays[j], arrays[j].length, 1);
				long end = System.currentTimeMillis();
				duration += end - start;
				
			}
			//get average timing
			duration = duration / 5;
			System.out.println("Array Size " + arrays[j].length + " || Running Time = " + duration);
		}
	}
	
	/**
	 * a method which searches the array for an element
	 * @param array
	 * @param n - size of array
	 * @param q - element we're searching for
	 * @return index of q in array or -1 if q not found
	 */
	public static int linearSearch(int [] array, int n, int q) {
		
		int index = 0;
		
		while(index < n && array[index] != q){
			index += 1;
		}
		
		if(index == n)
		{
			return -1;
		}
		else
		{
			return index;
		}
	}
}
