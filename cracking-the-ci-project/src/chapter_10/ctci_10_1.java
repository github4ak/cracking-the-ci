package chapter_10;

//Nice technique - merging from behind
import java.util.Arrays;

public class ctci_10_1 {

	public static void main(String args[]) {
		int a[] = new int[10];
		a[0] =  1;
		a[1] = 5;
		a[2] = 10;
		a[3] = 15;
		
		int b[] = {2,9,11,14};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		mergeFromBehind(a,b);
		
	}

	private static void mergeFromBehind(int[] a, int[] b) {
		int lasta =3;
		int lastb = b.length - 1;
		int lastMerged = 3+b.length - 1;
		int temp = 0;
		
		while(lastb>=0) {
			if(lasta >= 0 && a[lasta]>=b[lastb]) {
				a[lastMerged] = a[lasta];
				//a[lasta] = 0;
				lasta--;
			} else {
				a[lastMerged] = b[lastb];
				//[lastb] = 0;
				lastb--;
			}
			lastMerged--;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
