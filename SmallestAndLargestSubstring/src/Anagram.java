import java.io.*;
import java.util.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        //System.out.println(x + " " + y);
        if(x.length() != y.length()) return false;
        
        
        char[] X = x.toCharArray();
        char[] Y = y.toCharArray();
        Arrays.sort(X);
        Arrays.sort(Y);
        //without converting into string, we could have also compared two arrays instead strings
        String A = new String(X);
        String B = new String(Y);
        return (A.equals(B) ? true : false);
        
    }

   
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

