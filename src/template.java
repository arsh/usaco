/*
ID: andres.4
LANG: JAVA
TASK: test
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class template {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(0);
		out.close();
		System.exit(0);
	}
}
