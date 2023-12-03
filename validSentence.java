package validSentence;

public class validSentence {

	public static boolean isValidSentence(String sentence) {

		// check if string is empty and if the first letter of the string is uppercase
		if (sentence.isEmpty() || !Character.isUpperCase(sentence.charAt(0))) {
			return false;
		}

		// removes all characters except for quotation marks then checks if there is an
		// even number of quotation marks
		int count = sentence.replaceAll("[^\"]", "").length();
		if (count % 2 != 0) {
			return false;
		}

		// checks that the sentence ends with a period, question mark or exclamation
		// point
		char lastChar = sentence.charAt(sentence.length() - 1);
		if (lastChar != '.' && lastChar != '?' && lastChar != '!') {
			return false;
		}

		// checks if there is a period anywhere other than the end of the string
		if (sentence.substring(0, sentence.length() - 1).contains(".")) {
			return false;
		}

		// checks if numbers below 13 are spelled out
		String[] words = sentence.split("\\s+");
		for (String word : words) {
			if (isNumeric(word) && Integer.parseInt(word) < 13) {
				return false;
			}
		}

		return true;
	}

	// checks if a word in the string is a number
	private static boolean isNumeric(String str) {
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String testSentence = "A valid sentence.";
		if (isValidSentence(testSentence)) {
			System.out.println("The sentence is valid.");
		} else {
			System.out.println("The sentence is not valid.");
		}
	}
	
	
}
