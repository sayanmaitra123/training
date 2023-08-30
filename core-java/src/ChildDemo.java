
public class ChildDemo<S, A> extends Demo<S> {
	private A dummy;

	public ChildDemo(S data, A dummy) {
		super(data);
		this.dummy=dummy;
	}
	
	public A getDummy() {
		return dummy;
	}
	
	public void setDummy(A dummy) {
		this.dummy=dummy;
	}
	
	public static void main(String[] args) {
		ChildDemo<String,Integer> cd1= new ChildDemo<String,Integer>("DummyT",33);
		System.out.println(cd1.getData() +"\t"+ cd1.getDummy()); //To print the string value DummyT and then the integer value 33
	}
	
	
	
	
	
	

}
