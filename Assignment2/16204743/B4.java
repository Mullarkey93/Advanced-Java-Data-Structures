
/**
 * Question B4 from Assignment 2 COMP47500
 * @author Michael Mullarkey (16204743)
 *
 */
public class B4 {
	
	/**
	 * invoke the difference method
	 * @param args
	 */
	public static void main(String[] args) {
			difference(3, 2);
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
			System.out.println("Output\n" + (a - b));
			return a - b;
		}
		else
		{
			System.out.println("Output\n" + (b - a));
			return b - a;
		}
	}
}

