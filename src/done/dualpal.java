package done;
/*
ID: andres.4
LANG: JAVA
TASK: dualpal
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class dualpal {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();;
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		for (int i = S + 1; N > 0; i++) {
			int count = 0;
			for (int base = 2; base <= 10; base++) {
				if (isPali(Integer.toString(i, base))) {
					count++;
				}
				if (count == 2) {
					N--;
					out.println(i);
					break;
				}
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