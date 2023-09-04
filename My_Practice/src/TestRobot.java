import com.robots.MechanizedR;
import com.robots.VirtualR;

public class TestRobot {
	
	public static void main(String[] args) {
		
		MechanizedR m1=new MechanizedR("Industrial","R001","Box Management in warehouse",72,"electricity");
		VirtualR v1=new VirtualR("e-service","e-R002","Business Application services assistant","virtual","Kyle");
		
		m1.report();
		System.out.println();
		v1.report();
	}
}
