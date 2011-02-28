package done;
/*
ID: andres.4
LANG: JAVA
TASK: namenum
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class namenum {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();;
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		BufferedReader dict = new BufferedReader(new FileReader("dict.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		String num = f.readLine();
		String line;
		boolean none = true;
		while((line = dict.readLine()) != null) {
			if (num.equals(getNumber(line))) {
				out.println(line);
				none = false;
			}
		}
		if (none) out.println("NONE");
		out.close();
		System.exit(0);
	}
	
	private static String getNumber(String name) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < name.length(); i++) {
			sb.append(group((name.charAt(i) - 'A')));
		}
		return sb.toString();
	}

	private static int group(int num) {
		int ret = 0;
		if (num >= 22) ret = 9;
		else if (num >= 19) ret = 8;
		else if (num >= 15) ret = 7;
		else if (num >= 12) ret = 6;
		else if (num >= 9) ret = 5;
		else if (num >= 6) ret = 4;
		else if (num >= 3) ret = 3;
		else if (num >= 0) ret = 2;		
		return ret;
	}	

}
