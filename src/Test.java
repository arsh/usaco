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
		System.out.println("isPal:" + isPal("Madam:I'm Adam."));

	}

	/**
	 * Determine if an string is palindrome, case insensitive and
	 * don't pay attention to non-letter characters
	 */
	public static boolean isPal(String data) {
		int len = data.length();
		int middle = len / 2;
		int startCursor = 0;
		int endCursor = len - 1;
		while (startCursor < middle && endCursor > middle) {
			if (!Character.isLetter(data.charAt(startCursor))) {
				startCursor++;
				continue;
			}			
			if (!Character.isLetter(data.charAt(endCursor))) {
				endCursor--;
				continue;
			}
			if (Character.toLowerCase(data.charAt(startCursor)) != Character.toLowerCase(data.charAt(endCursor)))
				return false;
			startCursor++;
			endCursor--;
		}
		return true;
	}
	// public static char toLower(char c) {
	// if (isLetter(c))
	// }

	public static boolean isLetter(char c) {
		// Character.toLowerCase(ch)
		// determined using ASCII characters table
		return (c > 64 && c < 91) || (c > 96 && c < 123);
	}
}
