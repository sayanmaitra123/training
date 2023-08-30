import java.util.Properties;
import java.io.FileReader;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception{
		
		FileReader reader=new FileReader("src/person.txt");
		
		Properties p=new Properties(); // properties P is created here from the Properties class
		
		p.load(reader);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("city"));
		
	}

}
