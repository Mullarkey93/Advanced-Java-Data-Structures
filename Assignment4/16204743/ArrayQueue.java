
/**
 * 
 * @author Michael Mullarkey (16204743)
 *
 * ArrayQueue Class
 *
 * @param <T>
 */
public class ArrayQueue<T> implements Queue<T> {
    private T[] items;
    private int numItems = 0; 
    private int front = 0;      
    private int rear = 0;             
    
   /**
    * Constructor which fill object size to 1000
    */
    public ArrayQueue() {
        items = (T[])new Object[1000];
    }
    
    /**
     * Constructor which takes size from input
     * @param size
     */
    public ArrayQueue(int size) {
        items = (T[])new Object[size];
    }
    
    /**
     * Method to add item to queue
     */
    @Override
    public void enqueue(T item) {
    	if(size() == items.length - 1){
    		throw new FullQueueException();
    	}else{
    		
    	items[rear] = item;
        rear = (rear + 1) % items.length;
    	}
    }
    
    /**
     * Method which returns the size of the queue
     */
    @Override
	public int size() {
		return (items.length + rear - front) % items.length;
	}
    
    /**
     * Method which removes the object from the top of the queue
     */
    @Override
    public T dequeue() {
        if (isEmpty())
        	throw new QueueEmptyException();
        T removed = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        return removed;
    }
    
    /**
     * Method which returns whether the queue is empty or not
     */
    @Override
    public boolean isEmpty() {
        return (rear == front);
    }

    /**
     * Returns the object at the top of the queue
     */
	@Override
	public T front() {
		return items[front];
	}
	
	/**
	 * Method to "prettyify" output of the queue
	 */
	public String toString() {
		String out = front + "\t" + rear + "\t";
		for (int i = 0; i < items.length; i++) {
			out += " " + (items[i]!=null ? items[i] : "");
		}
		return out;
	}
	
	public static void main(String[] args) {
		Queue<String> queue = new ArrayQueue<String>();
		System.out.println("front" + "\t" + "rear" + "\t");
		
		queue.enqueue("Ireland");
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);

		queue.enqueue("England");
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue("Wales");
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue("Scotland");
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue("France");
		System.out.println(queue);
		
		queue.enqueue("Germany");
		System.out.println(queue);
		
	}
}