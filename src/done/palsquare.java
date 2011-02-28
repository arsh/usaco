package done;
/*
ID: andres.4
LANG: JAVA
TASK: palsquare
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class palsquare {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();;
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int B = Integer.parseInt(f.readLine());
		for (int N = 1; N <= 300; N++) {
			int sqr = (int)Math.pow(N, 2);
			if (isPali(Integer.toString(sqr, B))) {
				out.print(Integer.toString(N, B).toUpperCase() + " " + Integer.toString(sqr, B).toUpperCase());
				out.println();
			}
		}
		out.close();
		System.exit(0);
	}
	
	private static boolean isPali(String num) {
		boolean res = true;
		int len = num.length();
		int n = len/2;
		for (int i = 0; i <= n; i++) {
			if (num.charAt(i) != num.charAt(len - 1 - i)) {
				return false;
			}
		}
		return res;
	}
}
