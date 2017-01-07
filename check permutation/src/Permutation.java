import java.io.*;
import java.util.*;
public class Permutation {
	public static boolean perm(String s1, String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s3 = new String(c1);
		//System.out.println(s3);
		String s4 = new String(c2);
		//System.out.println(s4);
		if(s3.equals(s4)) return true;
		else return false;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(perm(s1,s2));
	}
}
