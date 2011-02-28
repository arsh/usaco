/*
ID: andres.4
LANG: JAVA
TASK: calfflac
 */

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class calfflac3 {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		FileReader in = new FileReader(probName + ".in");
		final int MAX = 20000;
		final int PAL_MAX = 2000;
		char[] data = new char[MAX];
		int len = in.read(data, 0, MAX);
		
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
//		out.println(0);
//		out.close();
		System.exit(0);
	}

}
