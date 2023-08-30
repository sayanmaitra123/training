
public class CmdLineDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (String a : args) {
			System.out.print(a + " ");

			sum = sum + Integer.parseInt(a);
		}
		System.out.println();
		System.out.println(sum);

		int x = 5;
		Integer xo = x; // Boxing
		int z = xo; // Un Boxing
		System.out.println(x + xo * z); // Done by Auto Boxing by Java itself

	}

}
