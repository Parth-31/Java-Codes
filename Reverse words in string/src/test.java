import java.util.*;
import java.io.*;

public class test {
    public static String reverseWords(String s) {
        if(s == null || s.length() == 0) 
            return "";
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(String x:str){
            System.out.println(x);
        }
        for(int i = str.length - 1; i>=0; i--){
            if(!str[i].equals(""))
                sb.append(str[i]).append(" ");
        }
        return sb.length() == 0 ? "" : sb.substring(0,sb.length()-1).toString();
    }
    public static void main(String[] args){
    	String a = reverseWords("1 ");
    	System.out.println(a);
    	
    }
}


