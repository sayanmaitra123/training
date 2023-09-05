package flights;
import java.util.Scanner;

public class FlightMenu {
	private static FlightDao dao;
	
	static {
		dao=new FlightDao();
	}
	
	public static void main(String[] args) {
		
		
		
		
		while(true) {
			Scanner console=new Scanner(System.in);
			System.out.println("Main Menu");
			System.out.println("1- By Route\n 2- By Carrier\n 3- By Code\n 4- Exit");
			System.out.println("Enter choice :");
			String choice=console.next();
			
			switch(choice) {
			case "1": byRoute(); break;
			case "2": byCarrier(); break;
			case "3": byCode(); break;
			case "4": System.exit(0);
			default: System.out.println("INVALID OPTION !!1");
			}
		//console.close();	
		}
	}

	private static void byRoute() {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("Enter Route no. ");
//		String org=console.nextLine();
//		String dst=console.nextLine();
		int rno=console.nextInt();
		dao.route(rno);
		//console.close();
		
		
		
		
	}

	private static void byCarrier() {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Carrier name ");
		String name=console.nextLine();
		System.out.println(dao.carrier(name));
		
	}

	private static void byCode() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Flight p=new Flight();
		System.out.println("Enter Flight Code");
		int code=sc.nextInt();
		
		System.out.println(dao.g);
		//sc.close();
		
		
	}

//	private static void addProduct() {
//		// TODO Auto-generated method stub
//		Scanner console=new Scanner(System.in);
//		
//		System.out.println("Enter Product Code");
//		int code=console.nextInt();
//		System.out.print("Enter Product Name:");
//		String name=console.next();
//		System.out.print("Enter product price");
//		double price=console.nextDouble();
//		
//		Product p=new Product(code, name, price);
//		dao.add(p);
	

}
