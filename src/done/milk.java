package done;
/*
ID: andres.4
LANG: JAVA
TASK: milk
 */

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class milk {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();

		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));

		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = parseInt(st.nextToken());
		int M = parseInt(st.nextToken());
		Prod[] data = new Prod[M];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine());			
			data[i] = new Prod(st.nextToken(), st.nextToken());
		}
		Arrays.sort(data);
		int total = 0;
		for (int i = 0; i < M && N > 0; i++) {
			Prod p = data[i];
			int amount = Math.min(N, p.amount);
			total += amount * p.price;
			N -= amount;
		}
		System.out.println(total);
		out.println(total);
		out.close();
		System.exit(0);
	}
}

class Prod implements Comparable<Prod> {
	int price;
	int amount;

	public Prod(String price, String amount) {
		this.price = parseInt(price);
		this.amount = parseInt(amount);
	}
	
	public int compareTo(Prod o) {
		return this.price - o.price;
	}
}