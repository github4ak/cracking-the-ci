package chapter_2;

/* Simplified the code too much :D */
public class ctci_2_5 {
	public static void main(String args[]) {
		Node head1 = new Node(7);
		head1.next = new Node(1);
		head1.next.next =  new Node(6);
		
		Node head2 = new Node(5);
		head2.next = new Node(9);
		head2.next.next = new Node(2);
		
		int sum = addList(head1,head2);
		
		System.out.println("The sum is "+sum);
	}
	
	static int addList(Node head1,Node head2){
		
		int digit =  100;
		int sum = 0;
		while(head1.next != null && head2.next !=null) {
			int val1 = head1.data;
			int val2 = head2.data;
			
			//Assuming 3-digit number
			sum += (val1+val2)*digit;
			digit /= 10;
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		sum += head1.data + head2.data;
		
		return sum;
	}
}
