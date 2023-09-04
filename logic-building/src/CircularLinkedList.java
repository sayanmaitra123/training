class Node {
    int data;
    Node next;
	public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        head = null;
    }

    public void addEmpty(int data) {
        Node newNode = new Node(data);
        head = newNode;
        newNode.next = head;
    }

    public void addEnd(int data) {
        if (head == null) {
            addEmpty(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}


