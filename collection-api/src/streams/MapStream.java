package streams;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {
	
	public static void main(String[] args) {
		
		Map<String,String> people=new HashMap<>();
		//Map<String,String> people=new LinkedHashMap<>();
		people.put("Polo", "Pune");
		people.put("Milli", "Mumbai");
		people.put("Deny", "Delhi");
		
		people.values().stream().forEach(System.out::println); //Order of values display is NOT in the order of values given above
		
		people.keySet().stream().forEach(System.out::println);
		
		List<String> cities=people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		
		}

}
