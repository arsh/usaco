package done;
/*
ID: andres.4
LANG: JAVA
TASK: milk2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class milk2 {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int N = Integer.parseInt(f.readLine());
		String[] milking = new String[N];
		for(int i = 0; i < N; i++) {
			milking[i] = f.readLine();
		}
		Arrays.sort(milking, new Comparator<String>() {
			public int compare(String s1, String s2) {
				int[] a = range(s1);
				int[] b = range(s2);
			    if(a[0] > b[0])
			    	return 1;
			    if(a[0] < b[0])
			    	return -1;
			    return 0;
			}
			
		});
		int[] cur = range(milking[0]);		
		int tmilk = cur[1] - cur[0];
		int tnomilk = 0;
		for (int i = 1; i < milking.length; i++) {
			int[] r = range(milking[i]);
			if (r[0] > cur[1]) {
				int t = r[0] - cur[1];
				tnomilk = max(tnomilk, t); 
				t = cur[1] - cur[0];
				tmilk = max(tmilk, t);
				cur = r;
			} else {
				if (r[1] > cur[1])
					cur[1] = r[1];
			}
		}	
		out.println(tmilk + " " + tnomilk);
		out.close();
		System.exit(0);
	}
	
	public static int[] range(String time) {
		int[] ret = new int[2];
		StringTokenizer t = new StringTokenizer(time);
		ret[0] = Integer.parseInt(t.nextToken());
		ret[1] = Integer.parseInt(t.nextToken());
		return ret;
	}
}
