
public class EliminateCharQuiz {
	public static void main(String[] args) {
		
		String str="Hello-Beautiful-World";
		
		System.out.println(eliminate(str,'-'));
	}

	private static String eliminate(String str, char ch) {
		
		String s="";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch)
				continue;
			
			s+=str.charAt(i);
			
		}
		
		return s;
	}
	
	

}
