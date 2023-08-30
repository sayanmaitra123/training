package inventory;
import java.util.Scanner;

public class MainMenu {
	private static ProductJdbcDao dao;
	static {
		dao=new ProductJdbcDao();
	}
	
	
	public static void main(String[] args) {
		while(true) {
			Scanner console=new Scanner(System.in);
			System.out.println("Main Menu");
			System.out.println("1- Add Product\n 2- Find Product\n 3- List Products\n 4- Delete Exit\n 5- Exit");
			System.out.println("Enter choice :");
			String choice=console.next();
			
			switch(choice) {
			case "1": addProduct(); break;
			case "2": findProduct(); break;
			case "3": listProduct(); break;
			case "4": deleteProduct(); break;
			case "5": System.exit(0);
			default: System.out.println("INVALID OPTION !!1");
			}
		//console.close();	
		}
	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.print("Enter Product Code");
		int code=console.nextInt();
		dao.delete(code);
		//console.close();
		
		
		
		
	}

	private static void listProduct() {
		// TODO Auto-generated method stub
		dao.list().forEach(System.out::println);
		
	}

	private static void findProduct() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.println("Enter Product Code");
		int code=sc.nextInt();
		
		System.out.println(dao.find(code));
		//sc.close();
		
		
	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter Product Code");
		int code=console.nextInt();
		System.out.print("Enter Product Name:");
		String name=console.next();
		System.out.print("Enter product price");
		double price=console.nextDouble();
		
		Product p=new Product(code, name, price);
		dao.add(p);
	}

}
