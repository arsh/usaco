/*
ID: andres.4
LANG: JAVA
TASK: calfflac
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class calfflac2 {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));

		StringBuilder data = new StringBuilder();
		String line;
		while ((line = in.readLine()) != null) {
			data.append(line + "\n");
		}

		final int MAX = 2000 + 1;
		int length = data.length();
		StringBuilder buffer = new StringBuilder();
		StringBuilder best = new StringBuilder();
		for (int i = 0; i < length; i++) {
			char start = data.charAt(i);
			if (!Character.isLetter(start))
				continue;
			buffer.append(start);
			for (int j = 1; i + j < length && j < MAX; j++) {
				char current = data.charAt(i + j);
				buffer.append(current);
				int dif = Math.abs(start - current);
				if (dif == 32 || dif == 0) {
					if (isPal(buffer))
						if (buffer.length() > best.length())
							best = new StringBuilder(buffer);

				}
			}
			buffer.delete(0, buffer.length());
		}

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(countLetters(best));
		out.println(best);
		out.close();
		System.exit(0);
	}

	private static boolean isPal(StringBuilder str) {
		StringBuilder letters = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				letters.append(str.charAt(i));
		}
		return letters.toString().equalsIgnoreCase(letters.reverse().toString());
	}
	
	private static int countLetters (StringBuilder sb) {
		int total = 0;
		for (int i =0; i < sb.length(); i++) {
			if (Character.isLetter(sb.charAt(i))) total++;
		}
		return total;
	}
}
