import java.util.*;
import java.io.*;
public class Unique {
	public static boolean isUnique(String s){
		boolean[] ans = new boolean[256];
		for(int i = 0; i < s.length(); i++){
			char val = s.charAt(i);
			if(ans[val]) return false;
			else ans[val] = true;
		}
		return true;
	}
	public static void main(String[] args){
		String s = "abcde";
		if(isUnique(s))
			System.out.println("It's Unique!");
		else
			System.out.println("It's not Unique!");
	}
}
