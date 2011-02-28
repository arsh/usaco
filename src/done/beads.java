package done;
/*
ID: andres.4
LANG: JAVA
TASK: beads
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class beads {

	public static void main(String[] args) throws IOException {
		final String probName = new Throwable().getStackTrace()[0].getClassName();
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		int N=Integer.parseInt(f.readLine());
		String nl=f.readLine();
		int max=0;
		for(int start=0; start<N; start++) {
			char cb=nl.charAt(start);
			int end = (start==0)?(N-1):(start-1);
			char ce=nl.charAt(end);
			int sum=0;
			boolean b=true;
			boolean e=true;
			int count=0;
			for(int i=0; i<N &&(b||e) && count<N; i++) {
				char c1=nl.charAt((start+i)%N);
				cb=(cb=='w')?c1:cb;
				if ((cb==c1 || 'w'==c1) && b) {
					sum++; count++;
				}else b=false;
				char c2 = nl.charAt((end-i<0)?N+(end-i):end-i);
				ce=(ce=='w')?c2:ce;
				if ((ce==c2 || 'w'==c2) && e && count<N) {
					sum++; count++;				
				}else e=false;
			}
			max=Math.max(max, sum);			
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.println(max);
		out.close();		
		System.exit(0);
	}
}
