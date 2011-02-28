package done;
/*
ID: andres.4
LANG: JAVA
TASK: friday
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class friday {

	public static void main(String[] args) throws IOException {
		final String probName = "friday";
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int N = Integer.parseInt(f.readLine());
		int yStart = 1900;
		int yEnd = yStart+N;
		int[] week = new int[7]; // 0=Sat, 1=Sun, 2=Mon, 3=Tue, 4=Wed, 5=Thu, 6=Fri
		int dayWeek = 2;
		for(;yStart<yEnd;yStart++) {
			for(int month=1; month<13; month++) {
				int days = getDays(month, yStart);
				for(int day=1; day<=days; day++, dayWeek=(dayWeek+1)%7) {
					if(day==13) {
						week[dayWeek]++;
					}
				}				
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<week.length; i++) {
			sb.append(week[i] + " ");
		}
		out.println(sb.toString().trim());
		out.close();
		System.exit(0);
	}

	public static int getDays(int month, int year) {
		int res=31;
		if (month==2) {
			if(isLeap(year)) 
				res=29;
			else 
				res=28;				
		}
		if(month==4||month==6||month==9||month==11)
			res=30;
		return res;
	}
	
	public static boolean isLeap(int year) {
		return (year%4==0) && (year%100 != 0 || year%400 == 0);
	}
}
