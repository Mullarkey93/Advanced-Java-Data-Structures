
/**
 * 
 * @author Michael Mullarkey (16204743)
 * 
 * Double-ended linked list queue
 *
 * @param <E>
 */
public class LinkedDeque<E> implements Deque<E> {

	/**
	 * Inner noed class
	 * @author Michael
	 *
	 */
	private class Node {
		E element;
		Node next;
		Node prev;

		public Node(E value) {
			element = value;
		}
	}

	Node rear;
	Node front;
	int size = 0;
	
	/**
	 * Returns the size of the queue
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Returns if the deque is empty of not
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Gets the first object in the deque
	 */
	@Override
	public E getFirst() throws EmptyDequeException {
		if (front == null){
			throw new QueueEmptyException();
		}
		return front.element;
	}

	/**
	 * Get the last object in the deque
	 */
	@Override
	public E getLast() throws EmptyDequeException {
		if (front == null){
			throw new QueueEmptyException();
		}
		return rear.element;
	}

	/**
	 * Adds an object to the top of the deque
	 */
	@Override
	public void addFirst(E element) {
		Node node = new Node(element);
		node.next = front;
		if (front == null){
			rear = node;
		}
		else {
			front.prev = node;
		}
		front = node;
		size++;
	}

	/**
	 * Add an object to the bottom of the deque
	 */
	@Override
	public void addLast(E element) {
		
		Node node = new Node(element);
		node.prev = rear;
		if (rear == null){
			front = node;
		}
		else {
			rear.next = node;
		}
		rear = node;
		size++;
	}

	/**
	 * Remove the object at the top of the deque
	 */
	@Override
	public E removeFirst() throws EmptyDequeException {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		Node node = front;
		front = front.next;
		if (front == null){
			rear = null;
		}
		else{ 
			node.next = null;
		}
		size--;
		return node.element;
		
	}

	/**
	 * Remove the object at the bottom of the deque
	 */
	@Override
	public E removeLast() throws EmptyDequeException {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		
		Node node = rear;
		rear = rear.prev;
		
		if(rear == null){
			front = null;
		}else{
			rear.next = null;
		}
		size--;
		return node.element;
	}
	
	/**
	 * Method to "prettyify" output of the deque
	 */
	public String toString() {
		String out = "";
		Node n = front;
		while (n != null) {
			out += "[" + n.element + "]-> ";
			n = n.next;
		}
		return out;
	}

}
