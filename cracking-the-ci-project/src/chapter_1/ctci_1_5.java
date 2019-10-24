package chapter_1;

/* This isn't well tested */

public class ctci_1_5 {
	
	private static boolean isItOneAway(String a,String b) {
		if(a.length() == b.length()) {
			return isItOneAwayReplace(a,b);
		}
		
		if(b.length() == a.length()+1) {
			return isItOneAwayInsert(a,b);
		}
		
		if(b.length() == a.length()-1) {
			return isItOneAwayRemove(a,b);
		}
		
		return false;
	}
	
	private static boolean isItOneAwayRemove(String a,String b) {
		return isItOneAwayInsert(b,a);
	}
	
	private static boolean isItOneAwayInsert(String a,String b) {
		
		/* Case where the last character was the inserted  one */
		if(b.substring(0, a.length()).equals(a)) {
			return true;
		}
		
		int no_of_equals = 0;
		
		int i = 0;
		int j = 0;
		
		while(i<b.length() && j<a.length()) {
			if(b.charAt(i)==a.charAt(j)) {
				no_of_equals++;
				i++;
				j++;
			} else {
				i++;
			}
		}
		
		if(no_of_equals == a.length()) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isItOneAwayReplace(String a,String b) {
		
		int no_of_replacements = 0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				no_of_replacements++;
			}
		}
		
		if(no_of_replacements > 1) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		String one = "pale";
		String two = "ple";		
		System.out.println("Is it one away ? "+isItOneAway(one,two));
	}

}
