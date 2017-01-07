import java.util.HashSet;


class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
}
public class Solution {
	public static ListNode reverseX(ListNode head,int alt){
		ListNode p = head;
		
	}
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = null;
		
		int alt = 2;
		
		System.out.println("Removed List");
		ListNode x = reverseX(head,alt);
		while(x!=null){
			System.out.println(x.data);
			x = x.next;
		}
	}
	
}
