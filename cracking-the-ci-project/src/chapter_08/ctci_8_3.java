package chapter_08;

//Part-2 : If not distinct, recurse through both the sides

public class ctci_8_3 {
	
	static int findMI(int a[],int l, int r) {
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == mid) {
				return mid;
			} else if(a[mid]>mid){
				return findMI(a,l,mid-1);
			} else {
				return findMI(a,mid+1,r);
			}
		}
		return -1;
	}
	
	
	public static void main(String args[]) {
		int arr[] = {-40,-20,-1,1,2,3,5,7,9,12,13};
		System.out.println("Magic Index present at "+findMI(arr,0,arr.length - 1));
		
	}

}
