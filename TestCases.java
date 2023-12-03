package validSentence;

public class TestCases {

	public static void main(String[] args) {

		// Test cases
		String validSentence1 = "A valid sentence.";
		String validSentence2 = "This is a valid sentence with numbers below 13: one.";
		String invalidSentence1 = "a sentence that Does not start with an uppercase letter";
		String invalidSentence2 = "A sentence with unmatched quotes\"";
		String invalidSentence3 = "A sentence without proper punctuation";
		String invalidSentence4 = "A sentence with a period in the middle. Like this.";
		String invalidSentence5 = "A sentence with a number below 13: 11";

		testSentence(validSentence1);
		testSentence(validSentence2);
		testSentence(invalidSentence1);
		testSentence(invalidSentence2);
		testSentence(invalidSentence3);
		testSentence(invalidSentence4);
		testSentence(invalidSentence5);
	}

	public static void testSentence(String sentence) {

		if (validSentence.isValidSentence(sentence)) {
			System.out.println("The sentence \"" + sentence + "\" is valid.");
		} else {
			System.out.println("The sentence \"" + sentence + "\" is not valid.");
		}
	}

}
