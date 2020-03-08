package chapter_5;

// Simpler solution was to use a XOR and count the 1's
public class ctci_5_6 {
	
	static String padZeroes(String str,int len) {
		for(int i=0; i<len;i++) {
			str =  "0"+str;
		}
		
		return str;
	}
	public static void main(String args[]) {
		int a = 15;
		int b = 29;
		
		String a_str = Integer.toBinaryString(a);
		String b_str = Integer.toBinaryString(b);
		
		int a_length = a_str.length();
		int b_length = b_str.length();
		
		int diff_len = a_length - b_length;
		
		if(diff_len>0) {
			b_str = padZeroes(b_str,diff_len);
		} else {
			a_str = padZeroes(a_str,-diff_len);
		}
		
		char[] a_arr = a_str.toCharArray();
		char[] b_arr = b_str.toCharArray();
		
		int count = 0;
		
		for(int i=0; i<a_arr.length;i++) {
			if(a_arr[i]!=b_arr[i]) {
				count++;
			}
		}
		
		System.out.println("Number of flips are "+count);	
	}
}
