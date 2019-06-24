package CodeQuestions;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "I will become a software developer.";

		String s1 = "I WILL BE A ENGINEER";

		System.out.println("Number of character in the string: " + s.length()); // Prints the total number of characters

		System.out.println("Character displayed on index number 14: " + s.charAt(14)); // Prints the character for the
																						// specific index.

		System.out.println("Index number for the specific character 'a': " + s.indexOf('a')); // Prints the index number
																								// for the specific
																								// character.

		System.out.println("Index number for the same multi-character 'a': " + s.indexOf('a', s.indexOf('a') + 1));

		System.out.println("Converting the sting to upper case: " + s.toUpperCase()); // Convert string to upper-case
																						// letters

		System.out.println("Converting the stirng to lower case: " + s1.toLowerCase()); // Convert string to lower-case
																						// letters

	}

}
