import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable {
	private final long countUntil;

	GoRunnable(long countUntil) {
		// TODO Auto-generated constructor stub
		this.countUntil = countUntil;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long sum = 0;

		for (int i = 1; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);

	}
}

public class ExecutorDemo {
	private static final int NTHREDS = 10;

	static int starTime = (int) System.currentTimeMillis();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS); //

		for (int i = 0; i < 500; i++) {
			Runnable worker = new GoRunnable(10000000L + i);
			executor.execute(worker); // execute() takes in a runnable object only, and this is a type of factory
										// method too(refer to previous explanations)

		}

		executor.shutdown();

		while (!executor.isTerminated()) {

		}
		System.out.println("Finished all threads !!!");
		int endTime = (int) System.currentTimeMillis();

		System.out.println("Duration: " + (endTime - starTime));
	}

}
