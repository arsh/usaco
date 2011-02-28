/*
ID: andres.4
LANG: JAVA
TASK: calfflac
 */

import java.io.FileReader;
import java.io.IOException;

public class calfflac {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		FileReader fileReader = new FileReader(probName + ".in");
		char[] printData = new char[20000];
		int len = fileReader.read(printData);
		char[] data = new char[len];
		for (int i = 0; i < len; i++)
			data[i] = Character.toLowerCase(printData[i]);

		int best = 0;
		int begin = 0;
		int end = 0;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j > (i + best); j--) {
				System.out.print(data[i] + ":" + data[j] + " ");
//				if (data[i] == data[j] && isPal(data, i, j)) {
//					int l = j - i + 1;
//					if (l > best) {
//						best = l;
//						begin = i;
//						end = j;
//					}
//				}
			}
			System.out.println();
		}
		System.out.println(best);
		System.out.println(String.valueOf(printData, begin, begin + end));
		// PrintWriter out = new PrintWriter(new BufferedWriter(new
		// FileWriter(probName + ".out")));
		// out.println(0);
		// out.close();
		System.exit(0);
	}

	private static boolean isPal(char[] data, int from, int to) {
		StringBuilder sb = new StringBuilder();
		while (from <= to) {
			if (Character.isLetter(data[from]))
				sb.append(data[from]);
			from++;
		}
		return sb.toString().equals(sb.reverse().toString());
	}
}
