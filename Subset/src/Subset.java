import java.util.*;
public class Subset {
	/*public static List<List<Integer>> sub(int[] S){
		List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
		
	}*/
	public static void main(String[] args){
		
		//List<List<Integer>> res = sub(n);
		/*for(List<Integer> x: res){
			System.out.println(x);
		}*/
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		List<Integer> n = new ArrayList<Integer>();
		System.out.println(n);
		System.out.println(al);
		
		
		
		
		
	}

}
