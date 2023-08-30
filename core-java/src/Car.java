import java.util.Iterator;

public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features) {  //the ... indicates var-args which indicates the variable no. of arguements of that type only which can be taken in
		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of: "+model);
		
		for (String f: features) {
			System.out.println(">"+f);
		}
	}
	
	
	
	public static void main(String[] args) {
		String[] af= {};
		Car alto=new Car("Suzuki Alto", "Keyless","AC","Power Window" );
		alto.specs();
		
		System.out.println();
		
		String[] sf= {};
		Car astor=new Car("MG Astor","ABS","Keyless","Auto","SunRoof");
		astor.specs();
		
		
		
	}

}
