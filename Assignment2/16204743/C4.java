
/**
 * Question C4 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class C4 {

	/**
	 * invoke the difference method multiple times and note the timings
	 * @param args
	 */
	public static void main(String[] args) {
		
		double duration = 0;
		for(int i = 0; i < 5; i++){
			
			long start = System.currentTimeMillis();
			difference(3, 2);
			long end = System.currentTimeMillis();
			duration += end - start;
			
		}
		duration = duration / 5;
		System.out.println("Running Time = " + duration);
	}
	
	/**
	 * A method for calculating the difference between to integers
	 * @param a int
	 * @param b int
	 * @return the difference between a and b
	 */
	public static int difference(int a, int b) {
		if(a > b)
		{
			return a - b;
		}
		else
		{
			return b - a;
		}
	}
}
