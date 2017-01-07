import java.util.*;

public class Solution {
	public static int[] twoSum(int[] nums, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++){
			int val = target - nums[i];
			if(map.containsKey(val)){
				result[0] = map.get(val);
				result[1] = i;
			}
			map.put(nums[i], i);
		}
		return result;
	}
	public static void main(String[] args){
		int[] a = {2, 7, 11, 15};
		int target = 9;
		int[] result = twoSum(a,target);
		for(int x : result){
			System.out.println(x);
		}
	}

}
