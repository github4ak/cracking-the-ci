package chapter_01;

public class ctci_1_6 {
	
	private static String compressString(String s) {
		char[] carr = s.toCharArray();
		StringBuilder snew = new StringBuilder();
		int count = 1;
		int i ;
		for(i=0;i<carr.length-1;i++) {
			if(carr[i+1] == carr[i]) {
				count++;
			} else {
				snew.append(carr[i]);
				snew.append(count);
				count = 1;
			}
		}
		
		/* Important to count the last one*/
		snew.append(carr[i]);
		snew.append(count);
		
		return snew.toString().length() < s.length()?snew.toString() : s;
	}
	
	public static void main(String args[]) {
		String a = "aaAAaaAAaaAAccccbbbBBB";
		System.out.println("The compressed version of "+a+" is "+compressString(a));
	}
}
