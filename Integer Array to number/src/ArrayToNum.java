import java.io.*;
import java.util.*;
public class ArrayToNum {
	public static void main(String[] args){
		int[] ar = {1,2,3,4};
		int num = 0;
		int mul = 1;
		for(int i = ar.length-1; i>=0; i--){
			num += ar[i]*mul;
			mul *= 10;
		}
		System.out.println(num);
	}
}
