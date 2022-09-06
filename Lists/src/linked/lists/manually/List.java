package linked.lists.manually;

public class List {
	
	Node head;
	Node tail;
	
	public static void main(String[] args) {
		System.out.println("Let's create a simple Linked List of 56, 30, 70");
		
		List nodeMethods = new List();
		nodeMethods.addNode(56);
		nodeMethods.addNode(30);
		nodeMethods.addNode(70);
		nodeMethods.printLinkedList();	
		
		System.out.println("\nAfter deleting the first element");
		nodeMethods.pop(56);
		nodeMethods.printLinkedList();
	}
	
	public void addNode(int element) {
		Node newNode = new Node(element);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insert(int element) {
		Node newNode = new Node(element);
		
		Node thisNode = head;
		while (thisNode.data != 56)
			thisNode = thisNode.next;
		
		newNode.next = thisNode.next;
		thisNode.next = newNode;
	}
	
	public void pop(int dataToRemove) {
		Node thisNode = head;
		
		if (dataToRemove == head.data) {
			thisNode = head.next;
			head = thisNode;
		}
	}
	
	public void printLinkedList() {
		Node thisNode = head;
		
		if (thisNode == null) 
			System.out.println("\nThe Linked list is empty.\n");
		else {
			System.out.println("\nDisplaying the Linked List : \n");
			while (thisNode != null) {
				System.out.print(thisNode.data + "\s");
				thisNode = thisNode.next;
			} 
		}
	}
}
