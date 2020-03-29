package chapter_02;

//Some version of the solution
public class ctci_2_7 {
	public static void main(String args[]) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		
		Node head2 = new Node(2);
		head2.next = head1.next.next;
		head2.next.next = head1.next.next.next;
		
		System.out.println("Intersecting at "+isIntersecting(head1,head2));
	}
	
	private static boolean isIntersecting(Node head1,Node head2) {
		TailAndSize ts1 = findLength(head1);
		TailAndSize ts2 = findLength(head2);
		int chopSize = 0;
		//Doesn't seems to be working
		if(!ts1.tail.equals(ts2.tail)) {
			System.out.println("Tails are different");
			return false;
		}
		
		if(ts1.size > ts2.size) {
			//Need to chop off ts1
			chopSize = ts1.size - ts2.size;
			
			while(chopSize>0) {
				head1 = head1.next;
				--chopSize;
			}
		} else if (ts2.size > ts1.size) {
			chopSize = ts2.size - ts1.size;
			
			while(chopSize>0) {
				head2 = head2.next;
				--chopSize;
			}
		}
		
		while(!head1.equals(head2)) {
			head1 = head1.next;
			head2 = head2.next;
		}
		
		System.out.println("Intersecting at "+head1.data);
		
		return true;
	}
	
	private static TailAndSize findLength(Node head) {
		int length = 0;
		Node temp = null;
		while(head!=null) {
			length++;
			temp = head;
			head = head.next;
		}
		return new TailAndSize(temp,length);
	}
}

class TailAndSize{
	Node tail;
	int size;
	
	public TailAndSize(Node node,int size){
		this.tail =  node;
		this.size = size;
	}
}
