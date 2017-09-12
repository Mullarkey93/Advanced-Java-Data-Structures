

/**
 * Question B10 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class B10 {

	/**
	 * invoke the linearSearch method
	 * @param args
	 */
	public static void main(String[] args) {
		int array [] = {5, 3, 4, 1, 2};
		linearSearch(array, array.length, 1);
	}
	
	/**
	 * a method which searches the array for a element
	 * @param array
	 * @param n - size of array
	 * @param q - element we're searching for
	 * @return index of q in array or -1 if q not found
	 */
	public static int linearSearch(int [] array, int n, int q) {
		
		int index = 0;
		
		
		while(index < n && array[index] != q){
			index++;
			System.out.println("array[index] " + array[index]);
			System.out.println("index " + index);
			System.out.print("-------------------\n");
		}
		
		if(index == n){
			System.out.println("Output\n" + -1);
			return -1;
		}
		else
		{
			System.out.println("Output\n" + index);
			return index;
		}
	}
	
}
