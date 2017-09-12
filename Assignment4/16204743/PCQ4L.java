
/**
 * 
 * @author Michael Mullarket (16204743) QC4
 *
 */
public class PCQ4L {
	public static void main(String[] args) {
		Deque<String> queue = new LinkedDeque<String>();
		
		queue.addFirst("Ireland");
		System.out.println(queue);
		
		queue.removeLast();
		System.out.println(queue);

		queue.addLast("England");
		System.out.println(queue);
		
		queue.removeFirst();
		System.out.println(queue);
		
		queue.addLast("Wales");
		System.out.println(queue);
		
		queue.addFirst("Scotland");
		System.out.println(queue);
		
		queue.addLast("France");
		System.out.println(queue);
		
		queue.removeFirst();
		System.out.println(queue);
		
		queue.removeLast();
		System.out.println(queue);
		
		queue.addLast("Germany");
		System.out.println(queue);
		
	}
}
