package chapter_02;

public class ctci_2_4 {
	
	 private static void traverseList(Node myNode){
		 System.out.println();
	        while(myNode !=null){
	            System.out.print(myNode.data+"->");
	            myNode = myNode.next;
	        }
	    }
	 
	 private static void partiton(Node head,int k) {
		 boolean addedbefore = false;
		 boolean addedafter = false;
		 
		 Node before = null;
		 Node after =  null;
		 Node newhead = null;
		 Node newafter = null;
		 
		 while(head != null) {
			 if(head.data < k) {
				 if(!addedbefore) {
					 before = new Node(head.data);
					 addedbefore = true;
					 newhead = before;
				 } else {
					 before.next = new Node(head.data);
					 before = before.next;
				 }
			 } else {
				 if(!addedafter) {
					 after =  new Node(head.data);
					 addedafter = true;
					 newafter = after;
				 } else {
					 after.next = new Node(head.data);
					 after = after.next;	
				 }
			 }
			 head = head.next;
		 }
		 
		 before.next = newafter;
		 
		 traverseList(newhead);
	 }
	 
	
	public static void main(String args[]) {
		Node head = new Node(3);
		head.next = new Node(5);
		head.next.next = new Node(8);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next = new Node(1);
		
		traverseList(head);
		partiton(head,5);
	}

}
