package chapter_10;

//Many new tidbits - Comparator classes, sort invocation
import java.util.Arrays;
import java.util.Comparator;

public class ctci_10_2 {
	
	public static void main(String args[]) {
		String a[] = {"adfd","labl","fdda","ball"};
		
		//See - how to invoke comparator class
		Arrays.sort(a, new AnagramComparator());
		
		System.out.println(Arrays.toString(a));
	}

}

//Comparator for string
class AnagramComparator implements Comparator<String>{

	public String sortChars(String s) {
		char content[] = s.toCharArray();
		Arrays.sort(content);
		
		// Character array to string
		return new String(content);
	}
	
	public int compare(String o1, String o2) {
		return sortChars(o1).compareTo(sortChars(o2));
	}
	
}
