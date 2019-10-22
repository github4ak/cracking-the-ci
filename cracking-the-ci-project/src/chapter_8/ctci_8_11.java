package chapter_8;

public class ctci_8_11 {
	
	private static int ways(int total,int coins[],int n) {
		int pos[] = new int[total+1];
		
		pos[0] = 1;
		
		for(int i=0; i<n;i++) {
			for(int j = 0;j<=total;i++ ) {
				if(j>=coins[i]) {
					pos[i]+=pos[i-coins[j]];
				}
			}
		}
		
		return pos[total];
	}
	
	public static void main() {
		int n =  45;
		int coins[] = {1,5,10,25};
		
		System.out.println("No. of ways to sum up the coins is"+ways(n,coins,coins.length));
	}
}
