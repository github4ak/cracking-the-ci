package chapter_01;

public class ctci_1_8 {
	
	/* To have two boolean rows and columns */
	private static void fillzeroes(int arr[][]) {
		boolean row[] = new boolean[arr.length];
		boolean col[] = new boolean[arr[0].length];
		int i,j;
		for(i=0; i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++) {
				if(arr[i][j] ==  0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		/* Fill row with zeroes */
		for(i=0;i<arr.length;i++) {
			if(row[i]) {
				zeroRow(arr,i);
			}
		}
		
		/* Fill col with zeroes */
		for(j=0;j<arr[0].length;j++) {
			if(col[j]) {
				zeroCol(arr,j);
			}
		}
	}
	
	private static void zeroCol(int arr[][],int col) {
		for(int i=0;i<arr.length;i++) {
			arr[i][col] = 0;
		}
	}
	
	private static void zeroRow(int arr[][],int row) {
		for(int i=0;i<arr[0].length;i++) {
			arr[row][i] = 0;
		}
	}
	
	public static void main(String args[]) {
		int arr[][] = {{1,2,3,4},
					   {1,2,3,4},
					   {0,2,0,4},
					   {1,2,3,4}};
		printMatrix(arr);
		fillzeroes(arr);
		printMatrix(arr);
	}
	
	private static void printMatrix(int arr[][]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------");
	}

}
