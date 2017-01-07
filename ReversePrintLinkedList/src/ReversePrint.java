//Assume that head contains data
//this is method solution only
//this program won't run

class Node{
	int data;
	Node next;
}

public class ReversePrint {
	public static void PrintReverse(Node head){
		if(head == null);
		else{
			PrintReverse(head.next);
			System.out.println(head.data);
		}
		
	}
}

/*
 * public static void PrintReverse(Node head){
		Stack<Integer> st = new Stack<Integer>();
		while(head != null){
		st.push(head);
		head = head.next;
		}
		while(!st.isEmpty()){
		System.out.println((st.pop()).data);
		}
		
	}
	*/
