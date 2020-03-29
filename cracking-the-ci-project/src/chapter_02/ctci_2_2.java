package chapter_02;

/* Good feeling to implement tortoise and head algorithm */

public class ctci_2_2 {
	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		int k = 3;
		
		findkthToLastElement(head,k);
	}
	
	private static void findkthToLastElement(Node head,int k) {
		Node p1 = head;
		Node p2 = head;
		
		int i = 0;
		
		while(i<k) {
			p1 = p1.next;
			i++;
		}
		
		while(p1!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		System.out.println("The "+k+"-kth element is "+p2.data);
	}
}
