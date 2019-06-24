package CodeQuestions;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,3,4,5};
		
		int x = 0;
		for(int i=0; i<a.length; i++) {
			x = x+a[i];
		}
		
		int y = 0;
		for(int j=1; j<=5; j++) {
			y = y+j;
		}

		System.out.println(y-x);
	}

}
