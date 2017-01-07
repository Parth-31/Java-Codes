import java.io.*;
import java.util.*;
class Node{
	Node next;
	int data;
	Node(int d){
		data = d;
	}
	
}
public class Linked {
	public static void main(String[] args){

	/*Node n = new Node(1);
	n.next = new Node(2);
	n.next.next = new Node(3);
	n.next.next.next = new Node(4);
	*/
	int[] arr = {1,8,2,7,3,3,4,3,2,1,5,6,2,2,2,1,1,1,2,3};
	Node n = new Node(arr[0]);
	Node head = n;
	for(int i = 1; i < arr.length; i++){
		n.next = new Node(arr[i]);
		n = n.next;
	}
	n = null;
	
	Set<Integer> set = new HashSet<Integer>();
	Node temp = head;
	
	set.add(temp.data);
	
	while(temp.next != null){
		if(set.contains(temp.next.data)){
			temp.next = temp.next.next;
		}
		else{
			set.add(temp.next.data);
			temp = temp.next;
		}
		
	}

	
	
	while(head !=null){
		System.out.println(head.data);
		head = head.next;
	}

	}
}