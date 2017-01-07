
public class twoSum {
	public static int[] sum(int[] nums, int target){
		int[] ans = new int[2];
		if(nums.length == 0) return ans;
		int i = 0, j = nums.length-1;
		while(i < j){
			int val = nums[i] + nums[j];
			if(val == target){
				ans[0] = i+1;
				ans[1] = j+1;
				break;
			}
			if(val > target){
				j--;
			}
			else if(val < target){
				i++;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int[] res = sum(arr,9);
		System.out.println(res);
	}
}
