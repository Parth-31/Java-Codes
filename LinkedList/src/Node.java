
public class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node p = head;
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = null;
		Node dummy = null;
		dummy.next = p;
		while(dummy.next != null){
			System.out.println(dummy.next.data);
			dummy = dummy.next;
		}
		
	}

}
