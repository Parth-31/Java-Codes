class ListNode{
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
}
public class SumLL {
	public static ListNode sum(ListNode p1, ListNode p2){
		ListNode ans = new ListNode(0);
		ListNode p = ans;
		int carry = 0;
		while(p1 != null || p2 != null){
			int x = (p1 == null) ? 0 : p1.data;
			int y = (p2 == null) ? 0 : p2.data;
			
			int sum = x + y + carry;
			p.next = new ListNode(sum%10);
			carry = sum/10;
			
			if(p1 != null) p1 = p1.next;
			if(p2 != null) p2 = p2.next;
			p = p.next;
		}
		if(carry>0){
			p.next = new ListNode(carry);
		}
		return ans.next;
		
	}
	
	
	
	
	
	public static void main(String[] args){
		ListNode head1 = new ListNode(3);
		head1.next = new ListNode(5);
		head1.next.next = new ListNode(8);
		head1.next.next.next = null;
		
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(1);
		head2.next.next = new ListNode(9);
		head1.next.next.next = null;
		
		
		
		ListNode x = sum(head1,head2);
		while(x!=null){
			System.out.println(x.data);
			x  = x.next;
		}
		
	}

}
