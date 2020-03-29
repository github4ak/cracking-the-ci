package chapter_02;

import java.util.Stack;

public class ctci_2_6 {
	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(6);
		head.next.next = new Node(2);
		head.next.next.next = new Node(6);
		head.next.next.next.next = new Node(1);
		head.next.next.next.next.next = new Node(2);
		
		System.out.println("Is palindrome ? "+isPalindrome(head));
	}
	
	private static boolean isPalindrome(Node head) {
		Node slow = head;
		Node fast = head;
		
		Stack<Integer> fList = new Stack<>();
		
		while(fast != null && fast.next != null) {
			fList.push(slow.data);
			slow =  slow.next;
			fast = 	fast.next.next;
		}
		
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int stackData = fList.pop();
			if(stackData != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}
}
