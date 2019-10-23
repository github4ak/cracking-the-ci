package chapter_1;

import java.util.*;

/* Easy way was to sort the char array and compare*/

public class ctci_1_2 {
	public static void main(String args[]) {
		String a = "aabbc";
		String b = "abcabc";
		
		char arr_a[] = a.toCharArray();
		char arr_b[] = b.toCharArray();
		
		Map<Character,Integer> set1 = new HashMap<>();
		Map<Character,Integer> set2 = new HashMap<>();
		
		
		for(char c:arr_a) {
			if(!set1.containsKey(c)) {
				set1.put(c, 1);
			} else {
				set1.put(c,set1.get(c)+1);
			}
		}
		
		for(char c:arr_b) {
			if(!set2.containsKey(c)) {
				set2.put(c, 1);
			} else {
				set2.put(c,set2.get(c)+1);
			}
		}
		
		boolean isPermutation = false;
		
		/* From here on, use Map.Entry to iterate through map*/
		for(Map.Entry<Character, Integer> entry : set1.entrySet()) {
			if(!set2.containsKey(entry.getKey())) {
				isPermutation = false;
				break;
			} else if(!set2.get(entry.getKey()).equals(entry.getValue())) {
				isPermutation = false;
				break;
			}
			isPermutation = true;
		}
		
		if(isPermutation) {
			System.out.println(a+" is a permutation of "+b);
		} else {
			System.out.println(a+" is not a permutation of "+b);
		}
		
	}
}
