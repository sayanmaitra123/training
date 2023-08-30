package flights;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightDao {
	
	private List<Flight> flights;
	
	public FlightDao()  {
		try {
			
		
		
		Stream<String> lines=Files.lines(Paths.get("src/flights.txt"));
		
		flights=lines.map(line -> {
			String[] record = line.split(",");
			return new Flight();
		}).collect(Collectors.toList());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public Flight route(Flight p) {
		// TODO Auto-generated method stub
		//flights.add(p);
		
		return flights.stream().filter(p -> p.getCode() == code).findFirst().get();

	}
	
	public Flight carrier(int code) {
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
