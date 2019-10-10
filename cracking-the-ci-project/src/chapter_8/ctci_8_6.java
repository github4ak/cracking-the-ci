package chapter_8;

//Very elegant approach - recursion uses stack internally

public class ctci_8_6 {
	
	static void moveDisks(int n,char org,char dest,char buffer) {
		if(n == 1) {
			System.out.println("Move "+org+" to "+dest);
			return;
		}
		
		moveDisks(n-1,org,buffer,dest);
		System.out.println("Move "+org+" to "+dest);
		moveDisks(n-1,buffer,dest,org);
		
	}
	
	public static void main(String args[]) {
		int numberOfDisks = 4;
		moveDisks(numberOfDisks,'A','C','B');
	}

}
