
public class TestDLL {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();

		dll.addToEnd(200);
		dll.addToFront(10);
		dll.addToEnd(15);
		dll.addToEnd(20);

		System.out.println("Double Linked List:");

		dll.displayForward();
		dll.displayBackward();

	}

}
