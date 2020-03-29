package chapter_08;

import java.util.ArrayList;
import java.util.Iterator;

public class ctci_8_7 {
	
	static ArrayList<String> getPermutations(String s){
		
		if(s == null) {
			return null;
		}
		
		ArrayList<String> perms = new ArrayList<>();
		
		//Base-case:This is required
		if(s.length() == 0) {
			perms.add("");
			return perms;
		}
		
		char first = s.charAt(0);
		
		String remainder = s.substring(1);
		
		ArrayList<String> words = getPermutations(remainder);
		
		for(String word:words) {
			for(int j = 0; j <= word.length(); j++) {
				String str = insertCharAt(first,word,j);
				perms.add(str);
			}
		}
		
		return perms;
	}
	
	static String insertCharAt(char first,String word,int i) {
		String begin = word.substring(0, i);
		String end = word.substring(i);
		return begin+first+end;
	}
	
	
	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> permutations = getPermutations(s);
		Iterator<String> it = permutations.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
