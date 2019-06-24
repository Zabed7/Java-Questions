package CodeQuestions;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "Long Beach", "LA", "Compton", "Long Beach", "Cerritos", "LA", "Cerritos" };

		for (int a = 0; a < names.length; a++) {
			for (int b = a + 1; b < names.length; b++) {

				if (names[a].equals(names[b])) {
					System.out.println("Duplicates names are: " + names[a]);
				}

			}

		}

	}

}
