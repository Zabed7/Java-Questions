package CodeQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		System.out.println("X is: " + x + " & " + "Y is: " + y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("X is: " + x + " & " + "Y is: " + y);

	}

}
