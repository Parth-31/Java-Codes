
public class Solution {
	public static int thirdMax(int[] nums){
		long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int x : nums){
            if(x>first){
                third = second;
                second = first;
                first = x;
            }
            else if(x == first) continue;
            else if(x<first && x>second){
                third = second;
                second = x;
            }
            else if(x == second) continue;
            else if(x<second && x>third){
                third = x;
            }
        }
        return third == Long.MIN_VALUE ? (int)first : (int)third;
	}
	public static void main(String[] args){
		int[] nums = {1,2,3};
		int third = thirdMax(nums);
		System.out.println(third);
	}
}
