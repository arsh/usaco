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

public class template {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.close();
		System.exit(0);
	}
}
