package chapter_03;

import java.util.Stack;

public class ctci_3_4 {
	public static void main(String args[]) {
		myQueue q = new myQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(10);
		
		System.out.println("The peek element is "+q.peek());
		
		q.pop();
		
		q.push(4);
		q.push(5);
		
		System.out.println("The popped element is "+q.pop());
	}
}

class myQueue{
	Stack<Integer> snew;
	Stack<Integer> sold;
	
	myQueue(){
		snew = new Stack<>();
		sold = new Stack<>();
	}
	
	private void shiftStacks() {
		if(sold.isEmpty()) {
			while(!snew.isEmpty()) {
				sold.push(snew.pop());
			}
		}
	}
	
	public void push(int value) {
		snew.push(value);
	}
	
	public int pop() {
		shiftStacks();
		return sold.pop();
	}
	
	public int peek() {
		shiftStacks();
		return sold.peek();
	}
}