
public class TestLinkedList {
	
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		l1.print();
		
		l1.addAfter(20, 25);
		l1.addAfter(30, 35);
		
		System.out.println();
		
		l1.addBefore(10, 5);
		l1.addBefore(20, 15);
		l1.print();
		
		System.out.println();
		
		l1.remove(5);
		
		l1.print();
		
		System.out.println();
	}

}
