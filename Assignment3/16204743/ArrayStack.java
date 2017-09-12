import java.util.*;

public class ArrayStack {
	private Object[] array;
	private int top;
	
	public ArrayStack() {
		this(4);
	}
	
	public ArrayStack(int capacity) {
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
		ArrayStack s = new ArrayStack();
		
		System.out.println(s);
		
		s.push("A");
		System.out.println(s);
		
		s.push("B");
		System.out.println(s);

		s.push("C");
		System.out.println(s);
		
	}
}