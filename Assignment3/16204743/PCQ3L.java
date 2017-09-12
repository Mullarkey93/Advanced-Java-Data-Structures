
import java.util.EmptyStackException;

public class PCQ3L {
	
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

	public PCQ3L() {
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
		PCQ3L s = new PCQ3L();
		
		s.push("ireland");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("England");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("Wales");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("Scotland");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("France");
		System.out.println(s);
		
		s.push("Germany");
		System.out.println(s);
		
	}
}
