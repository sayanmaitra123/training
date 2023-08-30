import java.util.Scanner;

public class ConsoleDemo {
	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
				
		System.out.println("Enter name:");
		System.out.println("Enter age:");
		String name=console.next();
		int age=console.nextInt();
		System.out.println("Your Name:"+name);
		System.out.println("Your Age: "+age);
	}

}
