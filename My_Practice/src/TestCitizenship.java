import com.visa.AliensC;
import com.visa.NationalsC;

public class TestCitizenship {
	
	public static void main(String[] args) {
		NationalsC n1=new NationalsC("John",22,"Male","22AH3432");
		AliensC a1=new AliensC("Tim",19,"Male","UK","XJJ089","JFK NYC");
		
		n1.identification();
		System.out.println();
		a1.identification();
	}
	
	

}
