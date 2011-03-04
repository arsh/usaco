public class Test {

	public static void main(String[] args) {
		// String data = "Confucius say to ada: Madam, I'm Ada;m ahdjfh fahjfa ";
		// int len = data.length();
		// for (int i = 0; i < len; i++) {
		// System.out.print(data.charAt(i));
		// }
		// System.out.println();
		// for (int i = 0; i < len; i++) {
		// System.out.print(data.charAt(len - 1 - i));
		// }
		// System.out.println("\n****************************");
		// System.out.println("isPal:" + isPal("MadamImAdam"));

		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			char c = (char) i;
			System.out.println(c + " : " + isLetter(c));
		}
		System.out.println("done in " + (System.currentTimeMillis() - start) + " (ms)");
	}

	public static boolean isPal(String data) {

		int len = data.length();
		for (int i = 0; i < len / 2; i++) {
			if (data.charAt(i) != data.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

	// public static char toLower(char c) {
	// if (isLetter(c))
	// }

	public static boolean isLetter(char c) {
		//Character.toLowerCase(ch)
		// determined using ASCII characters table
		return (c > 64 && c < 91) || (c > 96 && c < 123);
	}
}
