import java.util.*;

public class Pelindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String x = s.trim();
		char[] c = x.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char w: c){
			if(map.containsKey(w)){
				map.remove(w);
			}
			else{
				map.put(w,1);
			}
		}
		if(c.length%2 == 0){
			if(map.isEmpty()){
				System.out.println("Is Pelindrom!");
			}
			else{
				System.out.println("Not Pelindrom!");
			}
			
				
		}
		else{
			if(map.size() == 1){
				System.out.println("Is Pelindrom");
			}
			else{
				System.out.println("Not Pelindrom!");
			}
		}
		
		 

	}

}
