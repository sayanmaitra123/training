
public class TestCLL {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();

        cll.addEmpty(200);
        cll.addEnd(10);
        cll.addEnd(15);
        cll.addEnd(20);

        System.out.println("Circular Linked List:");
        
        cll.display();
        
	}

}
