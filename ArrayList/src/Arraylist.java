import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        ArrayList<int[]> al = new ArrayList<int[]>();
        int n = sc.nextInt();
        //System.out.println(n);
        
        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            int[] arr = new int[d];
            for(int j=0; j<d; j++){
                arr[j] = sc.nextInt();
          //      System.out.print(arr[i] + " ");
                
            }
            al.add(arr);
            //System.out.println();
        }
        int q = sc.nextInt();
        //System.out.println(q);
        for(int k=0; k<q; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
          //  System.out.println(y +" "+ x);
            try{
                System.out.println(al.get(x-1)[y-1]);
            }catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }
        
    }
}

