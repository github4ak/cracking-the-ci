package chapter_02;

public class ctci_2_3 {
	 public static void main(String args[]) {
			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(4);
			head.next.next.next.next = new Node(5);
			
			traverseList(head);
			System.out.println();
			deleteNode(head.next.next);
			traverseList(head);
	 }
	 
	 private static void deleteNode(Node givenNode) {
		 /* Need to put checks */
		 Node next = givenNode.next;
		 givenNode.data = next.data;
		 givenNode.next = next.next;
	 }
	 
	 private static void traverseList(Node myNode){
	        while(myNode !=null){
	            System.out.print(myNode.data+"->");
	            myNode = myNode.next;
	        }
	    }
}
