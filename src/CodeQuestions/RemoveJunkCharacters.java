package CodeQuestions;

public class RemoveJunkCharacters {
	
	public static void main(String[] args) {
		
		String s = "I #w*il@l b&e a2 s8of%t@wa$re de&v@elo0p3er";
		
		s = s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s);
	}

}
