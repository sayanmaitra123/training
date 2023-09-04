import java.awt.print.Printable;

public class SyncDemo implements Runnable {

	@Override

	public void run() {

		String name = Thread.currentThread().getName();
		print(name);

	}

	private Object dummy = new Object(); // This is just a dummy object, created for the representation purpose for the
											// synchronized given below in the print() method

	private void print(String name) {
		// synchronized method- basically it locks that object, from being accessed by
		// other threads
		System.out.println("Thread entered the me thod: " + name);
		try {
			synchronized (dummy) { // dummy refers to a dummy object that is created, while if 'this' keyword was
									// mentioned instead of dummy, then the object of this class would have done the
									// same so
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");

			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread completed the method" + name);
	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd, "Alfa");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gama");

		t1.start();
		t2.start();
		t3.start();

	}

}
