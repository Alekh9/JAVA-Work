public class NQueensPrintAny1Solutions {
	public static boolean isSafe(char board[][], int row, int col) {
		//Vertical up
		for(int i = row-1; i >=0; i--) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// Diagonally Left Up
		for (int i = row-1, j=col-1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		//Diagonally Right Up
		for (int i = row-1, j=col+1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}
	public static boolean nQueens(char board[][], int row) { // Changing return type from void to boolean
		// Base Case
		if (row == board.length) {
			return true;
		}
		// Col Loop
		for (int j=0; j< board.length; j++) {
			if (isSafe(board,row,j)) {
				board[row][j] ='Q';
			if (nQueens(board,row+1)) {
				return true;
				}
				board[row][j] = 'X';
			}
		}
		return false;
	}
	private static void printBoard(char[][] board) {
		System.out.println("-------------CHESS BOARD---------------");
		for (int i=0; i< board.length; i++) {
			for (int j=0; j< board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 4;

		char board[][] = new char[n][n];
		if (nQueens(board,0)) {
			System.out.println("Solution is Possible");
			printBoard(board);
		} else {
			System.out.println("Solution is NOT Possible");
		}

	}
}
