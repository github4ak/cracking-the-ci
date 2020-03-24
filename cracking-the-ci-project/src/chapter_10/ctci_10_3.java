package chapter_10;

public class ctci_10_3 {
	public static void main(String args[]) {
		int a[] = {15,16,19,20,25,1,3,4,5,7,10,14};
		int x = 14;
		System.out.println("Item "+x+" is at "+mbs(a,0,a.length-1,x));
	}

	private static int mbs(int[] a, int l, int r, int x) {
		if(l>r) {
			return -1;
		}
		
		int mid = (l+r)/2;
		
		if(x == a[mid]) {
			return mid;
		}
		
		if(a[l] < a[mid]) {
			//Equals to important
			if(x >= a[l] && x < a[mid]) {
				return mbs(a,l,mid-1,x);
			} 
			else {
				return mbs(a,mid+1,r,x);
			}
		}
		//Equals to important
		else if(a[l] > a[mid]) {
			if(x > a[mid] && x <= a[r]) {
				return mbs(a,mid+1,r,x);
			}
			else {
				return mbs(a,l,mid-1,x);
			}
		}
		else if(a[l] == a[mid]) {
			int res = mbs(a,l,mid-1,x);
			if(res == -1) {
				return mbs(a,mid+1,r,x);
			}
			else {
				return res;
			}
		}
		return -1;
	}
}
