package chapter_3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/*
 * Didn't implement the follow-up: Need roll-over stack elements
 */
public class ctci_3_3 {

	public static void main(String args[]) {
		SetOfStacks ss = new SetOfStacks();
		ss.push(12);
		ss.push(122);
		ss.push(22);
		
		System.out.println("Popped element is "+ss.pop());
		System.out.println("Popped element is "+ss.pop());
		
	}
}

class SetOfStacks {
	ArrayList<Stack<Integer>> ss = new ArrayList<>();
	int capacity = 2;
	
	public void push(int value) {
		Stack<Integer> last = getLastStack();
		if(last!=null && !isFull(last)) {
			last.push(value);
		} else {
			Stack<Integer> newStack = new Stack<>();
			newStack.push(value);
			ss.add(newStack);
		}
	}
	
	public int pop() {
		Stack<Integer> last = getLastStack();
		if(last == null) throw new EmptyStackException();
		int popped = last.pop();
		if(last.size() == 0) {
			ss.remove(ss.size() - 1);
		}
		return popped;
	}

	private Stack<Integer> getLastStack() {
		if(ss.isEmpty()) {
			return null;
		}
		return ss.get(ss.size() - 1); //Imp: To have the -1
	}
	
	private boolean isFull(Stack<Integer> last) {
		return last.size() == capacity ? true : false;
	}
	
}
