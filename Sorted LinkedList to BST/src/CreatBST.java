import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class CreatBST {
	public static List<Integer> inorderTraversal(TreeNode root) {
	    List<Integer> result = new ArrayList<Integer>();
	    if(root==null)
	        return result;
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(root);
	 
	    while(!stack.isEmpty()){
	        TreeNode top = stack.peek();
	        if(top.left!=null){
	            stack.push(top.left);
	            top.left=null;
	        }else{
	            result.add(top.val);
	            stack.pop();
	            if(top.right!=null){
	                stack.push(top.right);
	            }
	        }
	    }
	 
	    return result;
	}
	public static TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
        	pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if(pre != null){
        		pre.next = null;  //cannot do slow = null directly. will throw an error. 
        }
        else{
        		head = null;
        }
       
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }

	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode p = head;
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = null;
		TreeNode root = sortedListToBST(p);
		List<Integer> tra = inorderTraversal(root);
		for(int x:tra)
			System.out.println(x);
		
		
	}
}
