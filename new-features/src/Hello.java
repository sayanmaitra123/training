
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye() {    //Default type of methods can be declared in an interface
		return "Good Bye !!";
	}
	
	static void greeting() {    //Also, Static type of methods can be defined inside an interface
		System.out.println("Good Day");
	}
	
	

}
