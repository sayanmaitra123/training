package inventory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductDao {
	
	private List<Product> products;
	
	public ProductDao()  {
		try {
			
		Stream<String> lines=Files.lines(Paths.get("src/products.txt"));
		
		products=lines.map(line -> {
			String[] record = line.split(",");
			return new Product(Integer.parseInt(record[0]),record[1], Double.parseDouble(record[2]));
		}).collect(Collectors.toList());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public void add(Product p) {
		// TODO Auto-generated method stub
		products.add(p);
		
	}
	
	public Product find(int code) {
		// TODO Auto-generated method stub
		
		return products.stream().filter(p -> p.getCode() == code).findFirst().get();

	}
	
	public List<Product> list() {
		// TODO Auto-generated method stub
		
		
		return products;
		

	}
	
	public void delete(int code) {
		// TODO Auto-generated method stub
		products.removeIf(p -> p.getCode() == code);

	}

}
