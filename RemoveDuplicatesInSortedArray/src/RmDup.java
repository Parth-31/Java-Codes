import java.util.*;

public class RmDup {
	   public static int remove(int[] nums) {
	        if(nums.length == 0) return 0;
	        if(nums.length <= 2) return nums.length;
	        int flag = 1;
	        int i = 0;
	        for(int j = 1; j < nums.length; j++){
	            if(nums[i] == nums[j] && flag <= 2){
	                flag++;
	                i++;
	            }
	            else if(nums[i] != nums[j]){
	                i++;
	                nums[i] = nums[j];
	                flag = 1;
	            }
	        }
	        System.out.println("flag: " + flag + ", i: " +i);
	        /*if(flag == 2) return i;
	        else*/ return i+1;
	        	    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int newLength = remove(arr);
		System.out.println("New length is: " + newLength);
		for(int i = 0; i < newLength; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
