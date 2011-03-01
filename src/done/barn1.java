package done;
/*
ID: andres.4
LANG: JAVA
TASK: barn1
 */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class barn1 {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int M = parseInt(st.nextToken());
		int S = parseInt(st.nextToken());
		int C = parseInt(st.nextToken());

		int[] cs = new int[C];
		for (int i = 0; i < C; i++)
			cs[i] = parseInt(in.readLine());
		Arrays.sort(cs);
		int[] difs = new int[C - 1];
		int before = cs[0];
		for (int i = 1; i < cs.length; i++) {
			int current = cs[i];
			difs[i - 1] = Math.abs(current - before - 1);
			before = current;
		}
		Arrays.sort(difs);
		int boards = countBoards(cs);
		int total = C;
		for (int i = 0; i < difs.length && boards > M; i++) {
			int current = difs[i];
			total += current;
			if (current != 0)
				boards--;
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(total);
		out.close();
		System.exit(0);
	}

	public static int countBoards(int[] list) {
		int boards = 0;
		if (list.length >= 1)
			boards = 1;
		for (int i = 1; i < list.length; i++) {
			int diff = list[i] - list[i - 1];
			if (diff > 1)
				boards++;
		}
		return boards;
	}
}