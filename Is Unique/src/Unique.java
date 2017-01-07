import java.util.*;
import java.io.*;

public class Unique {
	public static boolean isUnique(String s){
		char c = s.charAt(0);
		boolean status = true;
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i) != c){
				status = false;
			}
		}
		return status;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isUnique(s));
	}
}

