
import java.util.EmptyStackException;

public class PCQL2 {
	
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

	public PCQL2() {
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
		PCQL2 s = new PCQL2();
		
System.out.println(s);
		
		s.push("e");
		System.out.println(s);
		
		s.push("s");
		System.out.println(s);
		
		s.push("c");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);

		s.push("u");
		System.out.println(s);
		
		s.push("a");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("o");
		System.out.println(s);
		
		s.push("t");
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.push("h");
		System.out.println(s);
		
		
	}
}

