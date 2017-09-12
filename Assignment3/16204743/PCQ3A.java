
import java.util.*;

public class PCQ3A {
	private Object[] array;
	private int top;
	
	public PCQ3A() {
		this(4);
	}
	
	public PCQ3A(int capacity) {
		array = new Object[capacity];
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public void push(Object o) {
		if (top == array.length - 1){
			throw new FullStackException();
		}
		else{
			array[top++] = o;
		}
	}
	
	public Object top() {
		return array[top];
	}

	public Object pop() {
		if (isEmpty()){
			throw new EmptyStackException();
		}
		else{
			Object temp = array[--top];
			array[top] = null;
			return temp;
		}
	}
	
	public String toString() {
		String out = top + "	";
		for (int i = 0; i < array.length; i++) {
			out += " " + (array[i]!=null ? array[i] : "");
		}
		return out;
	}
	
	public static void main(String[] args) {
		PCQ3A s = new PCQ3A();
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