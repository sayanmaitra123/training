import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
	
	public static void process(int i) {
		try {
			Thread.sleep(1);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers=IntStream.range(1, 99).boxed().collect(Collectors.toList());
		
		long startTime=System.currentTimeMillis();
		numbers.stream().forEach(ParallelStreamDemo::process);
		
		long endtime=System.currentTimeMillis();
		System.out.println("Time taken by sequential stream: "+ (endtime-startTime));
		
		startTime=System.currentTimeMillis();
		numbers.parallelStream().forEach(ParallelStreamDemo::process);
		endtime=System.currentTimeMillis();
		System.out.println("Time taken by parallel stream: "+(endtime-startTime));
		
		
		
	}

}
