
public class LinkedList {
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next=next;
		}
		
		public int getData() {
			return data;
		}
	}
	
	private Node first;
	private Node current;
	
	public void add(int d) { //To add a new node every time the ad() is called, with a value passed as an aurgument
		Node n=new Node(d);
		if(first==null) //If there's no node before, then first will be null by default
			first=n;
		if (current !=null) //If the current WOULD have been null, then it'd mean there is NO node existing BEFORE
			current.setNext(n); 
		
		current=n; //In case this is the first node being created, then the CURRENT would have to be initialized to this 'n' value
		
	}
	public void print() {
		Node t =first; //New FIRST poiting node created
		
		while(t!=null) { 
			System.out.println(t.getData());
			t=t.getNext();
		}
		
	}
	
	public void addAfter(int pos, int data) {
		Node n=new Node(data);
		Node t=first;//Node t is basically the counter node in this example
		
		
		while(t!=null) {
			if(t.getData()==pos) {
				if(t.getNext()==null)
					current=n;
				n.setNext(t.getNext());
				t.setNext(n);
				break;
			}
			t=t.getNext();
			
		}
		
	}
	
	public void addBefore(int pos, int data) {
		Node n=new Node(data);
		Node t=first;
		Node p=null;
		while(t!=null) {	
			if((t.getData())==pos)
				if(t==first) {
					n.next=t;
					first=n;
				}
				else {
					n.setNext(t);
					p.setNext(n);
				}
				break;
				
		}
		p=t;
		t=t.getNext();
		
		
		
				
				
				
				
	}
	
	public void remove(int pos) {
		Node t=first;
		Node p=null;
		while(t!=null) {	
			if((t.getData())==pos)
				if(t==first) {
					first=t.getNext();
					
				}
				else {
					
					p.setNext(t.getNext());
				}
				t.next=null;
				break;
				
		}		p=t;
		t=t.getNext();

		
	}
}
