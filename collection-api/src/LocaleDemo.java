import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		//ResourceBundle bundle=ResourceBundle.getBundle("msgs",Locale.FRANCE);
		Locale desi=new Locale("hi");
		ResourceBundle bundle=ResourceBundle.getBundle("msgs",desi);
		
		System.out.println(bundle.getString("greeting"));
		
		System.out.println(bundle.getString("message"));
		
		
		
		
		
	}
	
	

}
