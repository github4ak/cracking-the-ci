package chapter_02;

public class ctci_2_8 {
	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head.next.next;
		
		//Assume we have a loop
		System.out.println("Collision point is at "+findCollisionPoint(head));
	}
	
	private static int findCollisionPoint(Node head) {
		Node slow = head;
		Node fast = head;
		
		//Needed to move one step for each
		slow = slow.next;
		fast = fast.next.next;
		
		while(!slow.equals(fast)) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Intersecting at "+slow.data);
		
		slow = head;
		
		while(!slow.equals(fast)) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.data;
	}
}
