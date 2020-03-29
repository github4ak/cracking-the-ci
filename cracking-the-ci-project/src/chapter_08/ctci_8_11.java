package chapter_08;

import java.util.Arrays;

public class ctci_8_11 {
	
	private static int ways(int total,int coins[],int n) {
		int pos[] = new int[total+1];
		
		Arrays.fill(pos, 0);
		
		pos[0] = 1;
		
		for(int i=0; i<n;i++) {
			for(int j = 0;j<=total;j++ ) {
				if(j-coins[i]>=0) {
					pos[j]+=pos[j-coins[i]];
				}
			}
		}
		
		return pos[total];
	}
	
	public static void main(String args[]) {
		int n =  45;
		int coins[] = {1,5,10,25};
		
		System.out.println("No. of ways to sum up the coins is "+ways(n,coins,coins.length));
	}
}
