import java.util.*;
public class Dups {
	public static List<Integer> findDups(int[] ar){
		List<Integer> res = new ArrayList<Integer>();
		int n = ar.length;
		if(n==0) return res;
		for(int i = 0; i < n; i++){
			int val = ar[i] - 1;
			int index = val % n;
			ar[index] += n;
		}
		for(int i = 0; i < n; i++){
			if(ar[i] > 2*n) res.add(i+1);
		}
		return res;
 	}
	public static void main(String[] args){
		int[] ar = {2,2};
		List<Integer> res = findDups(ar);
		for(int x:res){
			System.out.println(x);
		}
		
	}
}
