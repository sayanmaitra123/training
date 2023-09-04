import java.util.Scanner;

public class PallindromeQuiz {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter a string");

		String word = console.next();

		System.out.println(checkPallindrome(word) ? "Pallindrome" : "Not Pallindrome");
	}

	private static boolean checkPallindrome(String word) {
		
		int count=0;
		String s="";
		
		for (int i = word.length()-1; i >=0; i--) {
			s+=(word.charAt(i));
			
		}
		
		if(s.equalsIgnoreCase(word))
			return true;
		else
			return false;
		
		
		
		
		

	}

}
