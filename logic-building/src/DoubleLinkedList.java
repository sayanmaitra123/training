
class DoubleLinkedList {
	class Node {
		int data;
		Node next;
		public Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;
	public Node tail;
	public Node prev;

	public DoubleLinkedList() {
		head = null;
		tail = null;
	}

	public void addToFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addToEnd(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void displayForward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
	}
}
