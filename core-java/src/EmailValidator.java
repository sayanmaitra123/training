
public class EmailValidator {
	public static void main(String[] args) {
		//Min 4 chars before @
		//Min 3 chars between @ and .
		//Only 1 occurence of @ and . is allowed
		//No regular expressions
		
		String email="zubair@gmail.com";
		
		
		
		int iat=email.indexOf('@');
		int idot=email.indexOf('.');
		
		if(iat==email.lastIndexOf('@') && idot==email.lastIndexOf('.') && iat>=4 && (idot-iat)>=3 && (email.length()-idot)>=2) {
			System.out.println("Valid");
		}
		else {
			System.out.println("In Valid");
		}
		
		
		
	}
}
