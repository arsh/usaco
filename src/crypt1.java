/*
ID: andres.4
LANG: JAVA
TASK: crypt1
 */

import java.io.IOException;

public class crypt1 {

	public static void main(String[] args) throws IOException {
		/*
		 * final String probName = new Throwable().getStackTrace()[0].getClassName(); BufferedReader in = new BufferedReader(new FileReader(probName + ".in")); StringTokenizer st =
		 * new StringTokenizer(in.readLine());
		 * 
		 * PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out"))); out.println(0); out.close(); System.exit(0);
		 */
		multiply(new int[] { 1, 2, 3, 4, 5 });
	}

	/**
	 * 
	 * @param i
	 *            is an array of exactly 5 elements, the first three numbers (from left-right) (i.e. i[0], i[1], i[2]) are the <b>dividend</b> digits, the last two (i[3], i[4]) are
	 *            the <b>divisor </b> digits
	 */
	public static void multiply(int[] i) {
		int factor1 = i[0] * 100 + i[1] * 10 + i[2];
		int factor2_1 = i[3];
		int factor2_2 = i[4];
		int factor2 = factor2_1 * 10 + factor2_2;
		
		int p1 = i[4] * factor1;
		int p2 = i[3] * factor1;
		
		int product = factor1 * factor2;

		System.out.println("factor1:" + factor1);
		System.out.println("factor2_1:" + factor2_1);
		System.out.println("factor2_2:" + factor2_2);
		System.out.println("factor2:" + factor2);
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println("product:" + product);
		
	}
}
