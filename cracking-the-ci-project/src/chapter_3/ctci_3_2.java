package chapter_3;

import java.util.Stack;

public class ctci_3_2 {
	
	public static void main(String args[]) {
		StackWithMin s = new StackWithMin();
		s.push(5);
		s.push(6);
		s.push(3);
		s.push(7);
		s.push(12);
		
		System.out.println("The current minimum value is "+s.getMin());
		
		s.pop();
		s.pop();
		
		System.out.println("The current minimum value is "+s.getMin());
		
	}
	
}

@SuppressWarnings("serial")
class StackWithMin extends Stack<Integer>{
	Stack<Integer> minStack;
	
	public StackWithMin(){
		minStack = new Stack<Integer>();
	}
	
	public void push(int value) {
		if(value <= getMin()) {
			minStack.push(value);
		}
		super.push(value);  // Imp: Note the use of super, "this" would have cause an error
	}
	
	public Integer pop() {
		if(this.peek() == minStack.peek()) {
			minStack.pop();
		}
		return super.pop();
	}
	
	public int getMin() {
		if(minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
		return minStack.peek();
		}
	}
		
}
