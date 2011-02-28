package done;
/*
ID: andres.4
LANG: JAVA
TASK: milk2
 */

import static java.lang.Math.max;
import static java.lang.Math.min;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class milk2_arsh {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();;
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int N = Integer.parseInt(f.readLine());
		boolean[] times = new boolean[1000000];
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(f.readLine());
			int start = Integer.parseInt(st.nextToken());
			min = min(min, start);
			int end = Integer.parseInt(st.nextToken());
			max = max(max, end);
			for(int c = start; c<end; c++) {
				times[c] = true;
			}
		}
		// milked
		int cm = 0;
		int mm = 0;
		// unmilked
		int cu = 0;
		int mu = 0;
		for(int i = min; i <= max; i++) {
			if (times[i]) {
				cm++;
				mu = max(mu, cu);
				cu = 0;
			} else {
				cu++;
				mm = max(mm, cm);
				cm = 0;
			}
		}
		out.println(mm + " " + mu);
		out.close();
		System.exit(0);
	}

}
