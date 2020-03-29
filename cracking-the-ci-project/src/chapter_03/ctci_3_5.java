package chapter_03;

import java.util.Stack;

public class ctci_3_5 {
	
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		s.push(7);
		s.push(2);
		s.push(5);
		s.push(3);
		s.push(1);
		
		stackSort(s);
		
		printElements(s);
	}
	
	static void stackSort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<>();
		while(!s.isEmpty()) {
			int temp = s.pop();
			while(!r.empty() && r.peek() > temp) {
				s.push(r.pop());
			}
			r.push(temp);
		}
		
		while(!r.isEmpty()) {
			s.push(r.pop());
		}
	}
	
	static void printElements(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop()+"-");
		}
	}

}
