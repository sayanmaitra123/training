
public class Demo<S> {
	private S data;

	public Demo(S data) {
		super();
		this.data = data;
	}
	public S getData() {
		return data;
	}
	public void setData(S data) {
		this.data=data;
	}
	public static void main(String[] args) {
		Demo d1=new Demo<String>("Holaa");   //<> is symbol for generalizer
		//d1.setData(3.14);
		System.out.println(d1.getData()); //This line would generate output of not 3.14 , and ONLY Holaa
		
		
		Demo d2=new Demo<Integer>(99); //This generalizer is used to generalize the type of parameter that'd be passed to the object, in this case an Integer type, and thus mentioned so
		//d2.setData("Go Home");
		System.out.println(d2.getData()); //Now since d2 has been defined as Integer type parameterized only, the output comes as 99
		
	}
	

}
