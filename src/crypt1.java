/*
ID: andres.4
LANG: JAVA
TASK: crypt1
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class crypt1 {

	private static boolean[] bMap = new boolean[10];
	private static int len = 0;

	public static void main(String[] args) throws IOException {

		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		len = Integer.parseInt(in.readLine().trim());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int[] set = new int[len];
		int i = 0;
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			bMap[num] = true;
			set[i++] = num;
		}

		int total = 0;
		for (int z = 0; z < len; z++)
			for (int y = 0; y < len; y++)
				for (int x = 0; x < len; x++)
					for (int w = 0; w < len; w++)
						for (int v = 0; v < len; v++)
							if (validate(new int[] { set[z], set[y], set[x], set[w], set[v] }))
								total++;

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.print(total);
		out.println();
		out.flush();
		out.close();
		System.exit(0);
	}

	/**
	 * 
	 * @param i
	 *            is an array of exactly 5 elements, the first three numbers (from left-right) (i.e. i[0], i[1], i[2]) are the <b>dividend</b> digits, the last two (i[3], i[4]) are
	 *            the <b>divisor </b> digits
	 */
	public static boolean validate(int[] i) {
		int factor1 = i[0] * 100 + i[1] * 10 + i[2];
		int factor2_1 = i[3];
		int factor2_2 = i[4];
		int factor2 = factor2_1 * 10 + factor2_2;

		int p1 = i[4] * factor1;
		int p2 = i[3] * factor1;

		int product = factor1 * factor2;

		return isValidNumber(p1, 999) && isValidNumber(p2, 999) && isValidNumber(product, 9999);
	}

	public static boolean isValidNumber(int num, int max) {
		if (num > max)
			return false;
		while (num > 0) {
			int i = num % 10;
			if (!bMap[i])
				return false;
			num /= 10;
		}
		return true;
	}
}
