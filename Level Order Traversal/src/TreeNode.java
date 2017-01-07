import java.util.*;
import java.io.*;
public class TreeNode {
	int val;
	TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    
    public static List<LinkedList<TreeNode>> levelOrder(TreeNode root){
    		List<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
    		LinkedList<TreeNode> level = new LinkedList<TreeNode>();
    		if(root == null) return result;
    		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    		LinkedList<TreeNode> next = new LinkedList<TreeNode>();
    		current.add(root);
    		
    		while(!current.isEmpty()){
    			TreeNode n = current.remove();
    			if(n.left != null) next.add(n.left);
    			if(n.right != null) next.add(n.right);
    			level.add(n);
    			
    			if(current.isEmpty()){
    				result.add(level);
    				current = next;
    				next = new LinkedList<TreeNode>();
    				level = new LinkedList<TreeNode>();
    				
    				
    			}
    		}
    		return result;
    	
    }
    
    public static void main(String[] args){
    		TreeNode root = new TreeNode(1);
    		root.left = new TreeNode(2);
    		root.right = new TreeNode(3);
    		root.left.left = new TreeNode(4);
    		root.left.right = new TreeNode(5);
    		root.right.left = new TreeNode(6);
    		root.right.right = new TreeNode(7);
    		
    		List<LinkedList<TreeNode>> result = levelOrder(root);
    		for(LinkedList<TreeNode> x : result){
    			for(TreeNode n : x){
    				System.out.print(n.val + " ");
    			}
    			System.out.println();
    		}
    	}
}


