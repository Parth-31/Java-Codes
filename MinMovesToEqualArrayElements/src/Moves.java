
public class Moves {
	public static int minMoves(int[] nums) {
        int sum = 0;
        for(int x : nums) sum+=x;
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]<min)
                min = nums[i];
        }
        return sum - min*nums.length;
        
    }
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		System.out.println(minMoves(nums));
	}
}
