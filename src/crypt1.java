/*
ID: andres.4
LANG: JAVA
TASK: crypt1
 */

import java.io.IOException;

public class crypt1 {

	public static void main(String[] args) throws IOException {
		/*
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		StringTokenizer st = new StringTokenizer(in.readLine());

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(0);
		out.close();
		System.exit(0);
		*/
		multiply(new int[]{1,2,3,4,5});
	}

	public static void multiply(int[] i) {
		int f1 = i[0] * 100 + i[1] * 10 + i[2];
		int f2 = i[3] * 10 + i[4];
		int m1 = i[0] * i[1] * i[2];
		int p1 = i[4] * m1;
		int p2 = i[3] * m1;
		
		System.out.println("f1:" + f1);
		System.out.println("f2:" + f2);
		System.out.println("m1:" + m1);
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
	}
}
