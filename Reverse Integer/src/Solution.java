
public class Solution {
	public static int reverseInt(int n){
		int sign = n < 0 ? -1 : 1;
		n = Math.abs(n);
		double res = 0;
		while(n != 0){
			res = res * 10 + (n % 10);
			n /= 10;
		}
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		
		return (int)res * sign;
	}
	public static void main(String[] args){
		int x = reverseInt(123);
		System.out.println(x);
	}
}
