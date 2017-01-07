import java.util.*;
class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
}
public class Partition {

	public static ListNode partitionLL(ListNode head,int part){
		if(head == null) return head;
		/*ArrayList<ListNode> low = new ArrayList<ListNode>();
		ArrayList<ListNode> high = new ArrayList<ListNode>();
		
		ListNode p = head;
		while(p!=null){
			if(p.data >= part){
				high.add(p);
			}
			else{
				low.add(p);
			}
			p = p.next;
		}
		ListNode q = new ListNode(0);
		ListNode newHead = q;
		for(ListNode x : low){
			q.next = x;
			q = q.next;
		}
		for(ListNode x : high){
			q.next = x;
			q = q.next;
		}
		q.next = null;
		return newHead.next;
		*/
		
		ListNode lowHead = null;
		ListNode low = lowHead;
		ListNode highHead = null;
		ListNode high = highHead;
		ListNode p = head;
		while(p != null){
			if(p.data < part){
				low.next = p;
				p = p.next;
				low = low.next;
			}
			else{
				high.next = p;
				p = p.next;
				high = high.next;
			}
		}
		
		if(high == null){
			low.next = null;
			return lowHead.next;
		}
		low.next = highHead.next;
		return lowHead.next;		
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
		int part = 5;
		
		
		ListNode x = partitionLL(head,part);
		while(x!=null){
			System.out.println(x.data);
			x  = x.next;
		}
		
	}

}
