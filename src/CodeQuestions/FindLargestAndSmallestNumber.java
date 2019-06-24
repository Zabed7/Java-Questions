package CodeQuestions;

import java.util.Arrays;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {

		int numbers[] = { 40, -22, 77, 1, -11, 3247 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int a = 1; a < numbers.length; a++) {
			if (numbers[a] > largest) {
				largest = numbers[a];
			} else if (numbers[a] < smallest) {
				smallest = numbers[a];
			}
		}

		//System.out.println("Given numbers: " + Arrays.toString(numbers));
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
	}

}
