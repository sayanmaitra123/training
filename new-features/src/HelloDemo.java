
public class HelloDemo {
	public static void main(String[] args) {
		
		Hello h1=() -> "Hello World";
		System.out.println(h1.sayHello());
		
		Hello h2=() -> {
			String msg="Ha Bhai !!";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		System.out.println(h1.sayBye());
		
		Hello.greeting(); //Calling the member method of an interface, using the name of the interafce, so static type methods inside an interface can ONLY be called using the name of the interface and not object of that interface
		
		
		
	}

}
