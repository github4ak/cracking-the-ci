package chapter_08;

public class ctci_8_1 {
	
	static int findHops(int n) {
		int hoparr[] = new int[n+1];
		hoparr[0] = 1;
		hoparr[1] = 1;
		hoparr[2] = 2;
		
		for(int i=3;i<=n;i++) {
			hoparr[i] = hoparr[i-1] + hoparr[i-2] + hoparr[i-3];
		}
		
		return hoparr[n];
	}
	
	public static void main(String args[]) {
		System.out.println("Number of ways to hop "+15+" steps with 1 or 2 or 3 hops is "+findHops(15));
	}

}
