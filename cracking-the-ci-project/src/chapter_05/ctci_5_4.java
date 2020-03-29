package chapter_05;

public class ctci_5_4 {

	public static void main(String args[]) {
		int a = 1775;
		System.out.println("Next largest with same bits "+findNextLarge(a));
		System.out.println("Next smallest with same bits "+findNextSmall(a));
	}

	private static int findNextSmall(int ip) {
		int bitcount = Integer.bitCount(ip);
		ip = ip - 1;
		boolean found = false;
		while(!found && ip > 0) {
			if(Integer.bitCount(ip) == bitcount) {
				found = true;
			} else {
			ip = ip - 1;
			}
		}
		return ip;
	}

	private static int findNextLarge(int ip) {
		int bitcount = Integer.bitCount(ip);
		ip =  ip + 1;
		boolean found = false;
		while(!found) {
			if(Integer.bitCount(ip) == bitcount) {
				found = true;
			} else {
			ip = ip + 1;
			}
		}
		return ip;
	}

}
