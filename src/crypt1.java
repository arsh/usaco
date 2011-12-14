/*
ID: andres.4
LANG: JAVA
TASK: crypt1
 */

import java.io.IOException;

public class crypt1 {

	private static boolean[] bMap = new boolean[10];
	private static int len = 0;

	public static void main2(String[] args) {
		int i = 101;
		while (i > 0) {
			System.out.println(i % 10);
			i /= 10;
		}
	}

	public static void main(String[] args) throws IOException {
		int[] set = { 2, 3, 4, 6, 8 };
		len = set.length;
		for (int i : set)
			bMap[i] = true;

		int total = 0;
		for (int z = 0; z < len; z++) {
			for (int y = 0; y < len; y++) {
				for (int x = 0; x < len; x++) {
					for (int w = 0; w < len; w++) {
						for (int v = 0; v < len; v++) {
							// System.out.print(set[z]);
							// System.out.print(set[y]);
							// System.out.print(set[x]);
							// System.out.print(set[w]);
							// System.out.print(set[v]);
							// System.out.println();
							if (validate(new int[] { set[z], set[y], set[x],
									set[w], set[v] })) {
								System.out.println("" + set[z] + set[y]
										+ set[x] + set[w] + set[v]);
								total++;
							}
						}
					}
				}

			}
		}
		System.out.printf("***********TOTAL %d************\n", total);

		/*
		 * final String probName = new
		 * Throwable().getStackTrace()[0].getClassName(); BufferedReader in =
		 * new BufferedReader(new FileReader(probName + ".in")); StringTokenizer
		 * st = new StringTokenizer(in.readLine());
		 * 
		 * PrintWriter out = new PrintWriter(new BufferedWriter(new
		 * FileWriter(probName + ".out"))); out.println(0); out.close();
		 * System.exit(0);
		 */
	}

	/**
	 * 
	 * @param i
	 *            is an array of exactly 5 elements, the first three numbers
	 *            (from left-right) (i.e. i[0], i[1], i[2]) are the
	 *            <b>dividend</b> digits, the last two (i[3], i[4]) are the
	 *            <b>divisor </b> digits
	 */
	public static boolean validate(int[] i) {
		int factor1 = i[0] * 100 + i[1] * 10 + i[2];
		int factor2_1 = i[3];
		int factor2_2 = i[4];
		int factor2 = factor2_1 * 10 + factor2_2;

		int p1 = i[4] * factor1;
		int p2 = i[3] * factor1;

		int product = factor1 * factor2;

		return isValidNumber(p1) && isValidNumber(p2) && isValidNumber(product);

		// System.out.println("factor1:" + factor1);
		// System.out.println("factor2_1:" + factor2_1);
		// System.out.println("factor2_2:" + factor2_2);
		// System.out.println("factor2:" + factor2);
		// System.out.println("p1:" + p1);
		// System.out.println("p2:" + p2);
		// System.out.println("product:" + product);
	}

	public static boolean isValidNumber(int num) {
		while (num > 0) {
			int i = num % 10;
			if (!bMap[i])
				return false;
			num /= 10;
		}
		return true;
	}
}
