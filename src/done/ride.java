package done;
/*
ID: andres.4
LANG: JAVA
TASK: ride
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ride {

	public static void main(String[] args) throws IOException {
		final String probName = "ride";
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		String s1 = f.readLine();
		String s2 = f.readLine();
		if(calc(s1) == calc(s2))
			out.println("GO");
		else 
			out.println("STAY");
		out.close();
		System.exit(0);
	}
	
	public static int calc(String name) {
		int res = 1;
		for(int i=0; i<name.length(); i++)
			res*= name.charAt(i)-'A'+1;
		return res%47;
	}

}
