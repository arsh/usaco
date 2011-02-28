/*
ID: arsh
LANG: JAVA
TASK: test
 */
import java.io.*;
import java.util.*;

class test {
	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();;
		// Use BufferedReader rather than RandomAccessFile; it's much faster		
		BufferedReader f = new BufferedReader(new FileReader(probName+".in"));
		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName+".out")));
		// Use StringTokenizer vs. readLine/split -- lots faster
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int sum=0;
		while(st.hasMoreElements()) {
			sum += Integer.parseInt(st.nextToken());
		}
		out.println(sum);
		out.close(); // close the output file
		System.exit(0); // don't omit this!
	}
}
