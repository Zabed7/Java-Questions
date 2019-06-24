package CodeQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String z = "Zabed";
		
		int a = z.length();
		String rev = "";
		
		for(int i=a-1; i>=0; i--) {
			rev = rev+z.charAt(i);
		}
		System.out.println(rev);
		
//*********************************************************************************************************
		
		String r = "Rahi";
		
		StringBuffer sb = new StringBuffer(r);
		System.out.println(sb.reverse());
	}

}
