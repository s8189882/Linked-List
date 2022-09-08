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
