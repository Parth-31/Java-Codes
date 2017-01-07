import java.util.*;


class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
}
public class RemoveDups {
	public static ListNode rmDups(ListNode head){
		if(head == null) return head;
		ListNode n = head;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(n.data);
		
		while(n.next != null){
			//System.out.println("In Loop: "+n.next.data);
			if(hs.contains(n.next.data)){
				n.next = n.next.next;
			}
			else{
				hs.add(n.next.data);
				n = n.next;
			}
			
		}
		return head;
	}
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next.next = null;
		System.out.println("Original List");
		ListNode p = head;
		while(p!=null){
			System.out.println(p.data);
			p = p.next;
		}
		
		System.out.println("Removed List");
		ListNode x = rmDups(head);
		while(x!=null){
			System.out.println(x.data);
			x = x.next;
		}
	}
	
}
