import java.util.*;
import java.io.*;

public class test {
	public static List<List<String>> groupStrings(String[] strings) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        for(String s : strings){
        	int offset = s.charAt(0) - 'a';
        	String key = "";
        	for(int i = 0; i < s.length();i++){
        		char c = (char) (s.charAt(i) - offset);
        		if(c < 'a')
        			c += 26;
        		key += c;
        	}
        	if(!map.containsKey(key)){
        		map.put(key, new ArrayList<String>());
        	}
        	map.get(key).add(s);
        }
        
        for(String key : map.keySet()){
        	result.add(map.get(key));
        }
        return result;
    }
	
    public static void main(String[] args){
    	String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
    	List<List<String>> x = groupStrings(strings);
    	for(List<String> ls : x){
    		System.out.println(ls);
    	}
    	
    	
    }
    	
    
}


