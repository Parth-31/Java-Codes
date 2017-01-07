//this will find kth last element
import java.util.*;

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
}
public class KthElem {
	public static int element(ListNode head, int pos){
		ListNode p = head;
		int count = 0;
		while(p!=null){
			count++;
			p = p.next;
		}
		int n = count - pos + 1;
		for(int i = 1; i < n; i++) head = head.next;
		return head.data;
		
		
	}
	public static void main(String[] args){
		
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(10);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(1);
		head.next.next.next.next.next.next.next = null;
		int pos = 2;
		
		
		int x = element(head,pos);
		System.out.println(x);
		
		
	}

}
