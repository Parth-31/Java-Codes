import java.util.*;
public class SortByFreq {
	public static String sortFreq(String s){
		int[] frequency = new int[256];
		HashMap<Integer,List<Character>> map = new HashMap<Integer,List<Character>>();
		char[] chString = s.toCharArray();
		for(char c : chString){
			frequency[c]++;
		}
		for(int i = 0; i < 256; i++){
			if(frequency[i] == 0) continue;
			int cnt = frequency[i];
			if(!map.containsKey(cnt)){
				map.put(cnt, new ArrayList<Character>());
			}
			map.get(cnt).add((char)i);
		}
		StringBuilder sb = new StringBuilder();
		for(int cnt = s.length(); cnt > 0; cnt--){
			if(!map.containsKey(cnt)) continue;
			List<Character> ls = map.get(cnt);
			for(char c : ls){
				for(int i = 0; i < cnt; i++){
					sb.append(c);
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String s = sortFreq("Trree");
		System.out.println(s);
	}
}
