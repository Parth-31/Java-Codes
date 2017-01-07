class ListNode{
	ListNode next;
	int val;
	ListNode(int x){
		val = x;
		next = null;
	}
}
public class Intersection {
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode p = head;
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		
		
		
	}
}
