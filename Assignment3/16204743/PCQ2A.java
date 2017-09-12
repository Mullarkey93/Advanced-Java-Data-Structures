

import java.util.*;

public class PCQ2A {
	private Object[] array;
	private int top;
	
	public PCQ2A() {
		this(6);
	}
	
	public PCQ2A(int capacity) {
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
		PCQ2A s = new PCQ2A();
		
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
