package done;

/*
ID: andres.4
LANG: JAVA
TASK: gift1
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class gift1 {

	public static void main(String[] args) throws IOException {
		final String probName = "gift1";
		BufferedReader f = new BufferedReader(new FileReader(probName + ".in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		int NP = Integer.parseInt(f.readLine());
		Map<String, Integer> m = new LinkedHashMap<String, Integer>(NP);
		for(int i=0; i<NP; i++) {
			String name = f.readLine(); 
			m.put(name, 0);
		}
		for(int i=0; i<NP; i++) {
			String name = f.readLine();
			StringTokenizer st = new StringTokenizer(f.readLine());
			int total = Integer.parseInt(st.nextToken());
			int friends = Integer.parseInt(st.nextToken());
			int each = (friends==0)?0:total/friends;
			for(int j=0; j<friends; j++) {
				String friendName = f.readLine();
				int amount = m.get(friendName);
				amount += each;
				m.put(friendName, amount);
				m.put(name, m.get(name)-each);
			}			
		}		
		for(String s : m.keySet()) {
			out.println(s + " " + m.get(s));
		}
		out.close();
		System.exit(0);
	}
}
