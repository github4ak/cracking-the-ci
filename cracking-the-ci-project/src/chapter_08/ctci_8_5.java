package chapter_08;

public class ctci_8_5 {
	
	static int findmin(int x,int y) {
		return x < y ? x : y;
	}
	
	static int multiply(int a,int b) {
		int min = findmin(a,b);
		int max;
		int ans = 0;
		max = (min == a) ? b : a;

		int mul2 = min/2;
		int mulmod2 = min%2;
		
		while(mul2 > 0) {
			ans+=max<<1;
			mul2--;
		}
		
		while(mulmod2 > 0) {
			ans+=max;
			mulmod2--;
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		int a = 1000;
		int b = 49;
		
		System.out.println(a+"*"+b+" is "+multiply(a,b));
	}

}
