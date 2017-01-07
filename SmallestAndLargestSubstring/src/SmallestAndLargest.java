import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SmallestAndLargest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner(System.in);
        String s = "welcometothejava";//sc.nextLine();
        int n = 3;//Integer.parseInt(sc.nextLine());
        String small = s.substring(0,n);
        String large = s.substring(0,n);
        for(int i = 1; i <= s.length()-n; i++){
            String current = s.substring(i,i+n);
            //System.out.println("Current: "+current);
            if(current.compareTo(small)<0){
                small = current;
                System.out.println("current: " + current + " Small: " + small);
            }
            if(current.compareTo(large)>0){
                large = current;
                System.out.println("current: " + current + " Large: " + large);
            }
            
        }
        System.out.println("small "+small);
        System.out.println("large " + large);
    }
}

