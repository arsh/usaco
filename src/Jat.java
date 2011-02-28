import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Jat {

	public static void main(String[] args) throws Exception {
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2009-09-16 10:38:13.0");
		System.out.println(date);
		System.out.println(sdf.format(date));
	}

	public static boolean isPal(char[] data, int from, int to) {
		StringBuilder sb = new StringBuilder();
		while (from <= to) {
			if (Character.isLetter(data[from]))
				sb.append(Character.toLowerCase(data[from]));
			from++;
		}
		return sb.toString().equals(sb.reverse().toString());
	}

	/**
	 * Convert day(s) to milliseconds. 1 day = 86400000 milliseconds.
	 * 
	 * @param days
	 *            to be converted.
	 * @return millisenconds in given day(s)
	 */
	public static long daysToMilliseconds(long days) {
		return days * 86400000;
	}
}
