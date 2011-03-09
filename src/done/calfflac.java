package done;
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

public class calfflac {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		FileReader fr = new FileReader(probName + ".in");
		char[] data = new char[20000];
		int dataLen = fr.read(data);
		char[] letters = new char[dataLen];
		int[] table = new int[dataLen];
		int len = 0;
		for (int i = 0; i < dataLen; i++) {
			char c = data[i];
			if (Character.isLetter(c)) {
				letters[len] = Character.toLowerCase(c);
				table[len] = i;
				len++;
			}
		}
		int bestStart = 0, bestEnd = 0, bestLen = 0;
		out:
		for (int start = 0; start < len; start++) {
			int end = Math.min(len -1 , start + 1999);
			int palLen = 0;
			while (end > start && (palLen = (end - start) + 1) > bestLen) {
				if (letters[start] == letters[end]) {
					if (isPalindrome(letters, start, end)) {
						bestStart = table[start];
						bestEnd = table[end];
						bestLen = palLen;
						if (bestLen == 2000)
							break out;
					}
				}
				end--;
			}
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(bestLen);
		for (int i = bestStart; i <= bestEnd; i++) {
			out.print(data[i]);
		}
		out.println();
		out.close();
		System.exit(0);
	}

	public static boolean isPalindrome(char[] data, int start, int end) {
		int len = (end - start) + 1;
		for (int cursor = start; cursor < start + (len / 2); cursor++) {
			if (data[cursor] != data[end - cursor + start])
				return false;
		}
		return true;
	}

}
