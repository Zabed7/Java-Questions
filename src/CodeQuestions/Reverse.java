package CodeQuestions;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s = "rahi";
		
		int a = s.length();
		String rev= "";
		
		for(int i=a-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
