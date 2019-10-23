package chapter_8;

public class ctci_8_12 {
	
	private static int k = 1;
	
	private static boolean isSafe(int[][] board,int row,int col) {
		int i,j;
		int n = board[0].length;
		//Check in the left row
		for(j=col;j>=0;j--) {
			if(board[row][j] == 1) {
				return false;
			}
		}
		
		//Check in the left upper diagonal
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		//Check in the left lower diagonal
		for(i=row,j=col;i<n && j>=0; i++,j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		return true;

	}
	
	
	private static boolean solveNQHelper(int[][] board,int col) {
		
		int n = board[0].length;
		
		boolean result = false;
		
		if(col>=n) {
			printSolutions(board,board[0].length);
			return true;
		}
		
		for(int i=0;i<n;i++) {
			if(isSafe(board,i,col)) {
				board[i][col] = 1;
				result = solveNQHelper(board,col+1) ;	
				board[i][col] = 0;
			}
		}
		
		return result;
	}
	
	private static void solveNQ(int n) {
		int board[][] = new int[n][n];		
		solveNQHelper(board,0);
		
	}
	
	private static void printSolutions(int[][] board,int n) {
		System.out.println("\nSolution "+k);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
		k++;
	}
	
	public static void main(String args[]) {
		solveNQ(8);
	}

}
