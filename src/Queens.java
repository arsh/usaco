public class Queens {

	private static int filled = 0;
	private static int cols = 4;
	private static int rows = 4;
	private static char[][] board = new char[rows][cols];
	private static final char TAKEN = '*';
	private static final char FREE = '-';

	public static void main(String[] args) {
		for (int i = 0; i < board.length; i++) {
			for (int y = 0; y < board.length; y++) {
				board[i][y] = FREE;
			}
		}

		search(0);

	}

	private static void search(int col) {
		if (filled == cols) {
			print(board);
			return;
		}
		for (int r = 0; r < rows; r++) {
			if (!isAttacked(r, col)) {
				board[r][col] = TAKEN;
				filled++;
				search(col + 1);
				board[r][col] = FREE;
				filled--;
			}
		}

	}

	private static void testIsAttacked() {
		board[3][3] = TAKEN;
		System.out.println(isAttacked(1, 2));

	}

	private static boolean isAttacked(int r, int c) {
		int i = r;
		for (; i < rows; i++)
			if (isTaken(i, c))
				return true;
		i = c;
		for (; i < cols; i++)
			if (isTaken(r, i))
				return true;

		i = r;
		int x = c;
		while (true) {
			i = (i + 1) % rows;
			x = (x + 1) % cols;
			if (i == r && x == c)
				break;
			if (isTaken(i, x))
				return true;
		}
		return false;
	}

	private static boolean isTaken(int r, int c) {
		return board[r][c] == TAKEN;
	}

	private static void print(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int y = 0; y < board.length; y++) {
				System.out.print(board[i][y] + "\t");
			}
			System.out.println();
		}
	}
}
