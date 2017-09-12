
import java.util.EmptyStackException;

public class LinkedStack {
	
	public class Node {
		Object element;
		Node next;
		
		public Node(Object element) {
			this.element = element;
		}
		
		public String toString() {
			return element.toString();
		}
	
	}
	
	int size;
	Node top;

	public LinkedStack() {
		top = null;
		size = 0;
	}
	public void push(Object o) {
		Node node = new Node(o);
		node.next = top;
		top = node;
		size++;
	}
	
	public Object pop() {
		if (isEmpty()){
			throw new EmptyStackException();
		}
		else{
			Object temp = top.element;
			top = top.next;
			size--;
			return temp;
		}
	}
	
	public Object top() {
		if (isEmpty()){
			throw new EmptyStackException();
		}
		else{
			return top.element;
		}
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	// state visualisation
	public String toString() {
		
		String output = "";
		Node node = top;
		while (node != null) {
			output += node.element.toString() + " ";
			node = node.next;
		}
		return " " + size + "\t" + output;
	}

	public static void main(String[] args) {
		LinkedStack s = new LinkedStack();
		
		System.out.println(s);
		s.push("A");
		System.out.println(s);
		
		s.push("B");
		System.out.println(s);

		s.push("C");
		System.out.println(s);
		
	}
}
