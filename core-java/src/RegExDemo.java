
public class RegExDemo {
	public static void main(String[] args) {
		String name="Sayan";
		String mobile="9259117762";
		String email="sayanmaitra@yahoo.com";
		
		String nameRegex= "[A-Z]{1}[a-z]{3,}";
		String mobileRegex="[6-9]{1}[0-9]{9}";
		String emailRegex="/^w+[+.w-]*@([w-]+.)*w+[w-]*.([a-z]{2,4}|d+)$/i";
		
		System.out.println(name.matches(nameRegex)?"VALID" : "INVALID");
		System.out.println(mobile.matches(mobileRegex)?"VALID" : "INVALID");
		System.out.println(email.matches(emailRegex)?"VALID": "INVALID");
	}

}
