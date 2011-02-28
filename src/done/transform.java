package done;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class transform {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int N = Integer.parseInt(f.readLine());
		char[][] original = new char[N][N];
		char[][] current = new char[N][N];
		for (int i = 0; i < N; i++) {
			current[i] = f.readLine().toCharArray();
			original[i] = current[i];
		}
		char[][] transf = new char[N][N];
		for (int i = 0; i < N; i++) {
			transf[i] = f.readLine().toCharArray();
		}
		// transformation number
		byte tn = 0;
		if (equals(current = rotate(current), transf)){
			tn = 1;
		} else if (equals(current = rotate(current), transf)) {
			tn = 2;
		} else if (equals(current = rotate(current), transf)) {
			tn = 3;
		} else if (equals(current = reflect(original), transf)) { // reflect original
			tn = 4;
		} else if (equals(current = rotate(current), transf) ||
				equals(current = rotate(current), transf) ||
				equals(current = rotate(current), transf)) {
			tn = 5;
		} else if (equals(original, transf)) {
			tn = 6;
		} else tn = 7;
		System.out.println(tn);
		out.println(tn);
		out.close();
		System.exit(0);
	}

	// 90 Degree Rotation: Rotate clockwise 90 degrees.
	private static char[][] rotate(char[][] c) {
		char[][] c2 = new char[c.length][c.length];
		int len = c.length;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= 0 ; j--) {
				c2[i][len-1-j] = c[j][i];
			}
		}		
		return c2;
	}
	
	// reflect
	private static char[][] reflect(char[][] c) {
		char[][] c2 = new char[c.length][c.length];
		int len = c.length;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= 0 ; j--) {
				c2[i][len-1-j] = c[i][j];
			}
		}		
		return c2;
	}		
	/*
	 * Don't do extra validation to avoid lot of code. Assuming that both arrays
	 * are not null and have the same length.
	 */
	private static boolean equals(char[][] a, char[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i][j] != b[i][j])
					return false;
			}
		}
		return true;
	}	
}
