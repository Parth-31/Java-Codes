import java.util.*;
import java.io.*;
public class URL {
	public static void spaceFiller(char[] ch, int len){
		int space = 0;
		for(int i = 0; i<len; i++){
			if(ch[i] == ' ') space++;
		}
		
		int index = len + 2*space;
		int addSpaceCount = 2*space - (ch.length - len);
		String temp = new String(ch);
		for(int i = 0; i < addSpaceCount; i++){
			temp = temp + ' ';
		}
		
		ch = temp.toCharArray();
		//if(len < ch.length) ch[len] = '\0';
		for(int i = len-1; i>=0; i--){
			if(ch[i] == ' '){
				ch[index - 1] = '0';
				ch[index - 2] = '2';
				ch[index - 3] = '%';
				index -= 3;
			}
			else{
				ch[index - 1] = ch[i];
				index--;
			}
		}
		String result = new String(ch);
		System.out.println(result);
	}
	public static int lengthFinder(char[] str){
		for(int i = str.length-1; i>=0; i--){
			if(str[i] != ' '){
				return (i+1);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		String s = "Mr John Smith";
		char[] str = s.toCharArray();
		int truelength = lengthFinder(str);
		spaceFiller(str,truelength);

	}

}
