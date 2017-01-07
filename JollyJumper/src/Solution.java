import java.io.*;
import java.util.*;
public class Solution {
	
	public boolean isJollyJumper (int[] arr) {
		if (arr==null || arr.length==0) {
			return false;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i=1;i<arr.length;i++) {
			int diff = Math.abs(arr[i]-arr[i-1]);
			set.add(diff);
		}
		
		for (int i=1;i<=arr.length-1;i++) {
			if (!set.contains(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution jj = new Solution();
		int[] arr = new int[]{1,4,2,3};
		
		if (jj.isJollyJumper(arr)) {
			System.out.println("Jolly Jumper");
		} else {
			System.out.println("Not a Jolly Jumper");
		}
	}
}

