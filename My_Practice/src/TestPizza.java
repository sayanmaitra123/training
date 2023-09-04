import com.pizza.NonVegP;
import com.pizza.VegP;

public class TestPizza {
	public static void main(String[] args) {
		
		VegP v1=new VegP("Wheat",25,"Margherita type","Veg","Simple",2);
		NonVegP nv1=new NonVegP("Glucogen-free wheat",25,"Italiano","Non Veg",1);
		v1.bill();
		System.out.println();
		nv1.bill();
		
	}

}
