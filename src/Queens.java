public class Queens {
	public static void main(String[] args) {
		char[][] board = new char[4][4];
		for (int i = 0; i < board.length; i++) {
			for (int y = 0; y < board.length; y++) {
				board[i][y] = '0';
			}
		}
		
		
		

		print(board);

	}


	private static void print(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int y = 0; y < board.length; y++) {
				System.out.print(board[i][y]);
			}
			System.out.println();
		}
	}
}
