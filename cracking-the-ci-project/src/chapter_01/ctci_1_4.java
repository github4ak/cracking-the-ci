package chapter_01;

import java.util.*;

public class ctci_1_4 {
	
	public static void main(String args[]) {
		String a = "ta c  t  coapaps  a";
		a = a.replaceAll("\\s+", "");
		
		boolean isEven =  false;
		
		if(a.length()%2 == 0) {
			isEven = true;
		}
		
		char arr[] = a.toCharArray();
		
		Map<Character,Integer> countmap = new HashMap<>();
		
		for(char c : arr) {
			if(!countmap.containsKey(c)) {
				countmap.put(c, 1);
			} else {
				countmap.put(c,countmap.get(c)+1);
			}
		}
		
		int[] countarr = new int[countmap.size()];
		int i= 0;
		
		for(Map.Entry<Character, Integer> entry : countmap.entrySet()) {
			countarr[i] = entry.getValue();
			i++;
		}
		
		Arrays.sort(countarr);
		
		boolean isEvenPalindrome = true;
		boolean isOddPalindrome = true;
		
		int oddcount = 0;
		
		if(isEven) {
			for(i=0;i<countarr.length;i++) {
				if(countarr[i]%2 != 0) {
					isEvenPalindrome = false;
					break;
				}
			}
		} else {
			for(i=0;i<countarr.length;i++) {
				if(countarr[i]%2 != 0) {
					oddcount++;
				} 
				
				if(oddcount > 1) {
					break;
				}
			}
		}
		
		if(oddcount != 1) {
			isOddPalindrome = false;
		}
		
		if((isEven && isEvenPalindrome)||(!isEven && isOddPalindrome)) {
			System.out.println("Is a Palindrome permutation");
		} else {
			System.out.println("Is not a palindrome permutation");
		}
	}

}
