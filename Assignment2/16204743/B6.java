
/**
 * Question B6 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class B6 {
	
	/**
	 * invoke the minValueIndex method
	 * @param args
	 */
	public static void main(String[] args) {
		int array [] = {5, 3, 4, 1, 2};
		minValueIndex(array, array.length);
	}
	
	/**
	 * A method which find the index of the smallest value in an array
	 * @param array
	 * @param n - size of array
	 * @return index of the smallest value in the array
	 */
	public static int minValueIndex(int array [], int n) {
		
		int minValueIndex = 0;
		
		for(int k = 1; k <= n-1; k++){
			System.out.println("array[minVlaueIndex] " + array[minValueIndex]);
			System.out.println("array[k]" + array[k]);
			if(array[minValueIndex] > array[k]){
				minValueIndex = k;
				System.out.println("minVlaueIndex " + minValueIndex + "\n");
			}
			System.out.println("minVlaueIndex " + minValueIndex);
			System.out.print("-------------------\n");
		}
		System.out.println("------Output------\n" + minValueIndex);
		return minValueIndex;
		
	}

}
