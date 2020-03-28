package chapter_10;

public class ctci_10_9 {
	public static void main(String args[]) {
		int matrix[][] = {{15,20,40},
						  {20,35,80},
						  {30,55,95},
						  {40,80,100}};
		
	    int search = 40;
	    
	    System.out.println(sortedSearch(matrix,search));
	}

	//Naive search
	private static boolean sortedSearch(int[][] matrix, int search) {
		
		int row_length = matrix.length;
		int col_length = matrix[row_length-1].length;
		
		int row = 0;
		int col = col_length -1;
		
		while(row < row_length && col < col_length && row >= 0 && col >= 0) {
			if( search == matrix[row][col]) {
				return true;
			}
			else if(search > matrix[row][col]) {
				row++;
			}
			else {
				col--;
			}
		}
		
		return  false;
	}

}
