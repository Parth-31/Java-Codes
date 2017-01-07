
public class Solution {
	public static int strStr(String s, String n){
		for(int i = 0; ; i++){
			for(int j = 0; ; j++){
				if(j == n.length()) return i;
				if(i+j == s.length()) return -1;
				if(n.charAt(j) != s.charAt(i+j)) break;
			}
		}
	}
	public static void main(String[] args){
		String s = "abcdefghijklmnopqrstuvwxyz";
		String needle = "klmn";
		int x = strStr(s,needle);
		System.out.println(x);
	}
}
