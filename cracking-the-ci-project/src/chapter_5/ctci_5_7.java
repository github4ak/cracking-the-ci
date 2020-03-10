package chapter_5;

public class ctci_5_7 {
	
	public static void main(String args[]) {
		int n = 156;
		System.out.println("Binary rep of original is "+Integer.toBinaryString(n));
		
		int p_a = (((n & 0xaaaaaaaa) >>> 1 ) | ((n & 0x55555555) << 1));
		
		System.out.println("Pair-wise swap is "+Integer.toBinaryString(p_a));
	}

}
