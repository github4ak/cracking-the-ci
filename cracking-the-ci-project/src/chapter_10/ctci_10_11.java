package chapter_10;

//Beautiful solution
import java.util.Arrays;

public class ctci_10_11 {
	
	public static void main(String args[]) {
		int arr[] = {9,1,8,4,7,0};
		
		sortPeakAndValley(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void sortPeakAndValley(int arr[]) {
		Arrays.sort(arr);
		
		for(int i=1; i < arr.length;i+=2) {
			swap(arr,i-1,i);
		}
	}

	private static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
