import java.io.*;
import java.util.*;

public class InsertionSort {

    public static void insertionSortPart2(int[] ar)
    {       
        int n = ar.length;
        for(int i = 1; i<n; i++){
            int v = ar[i];
            
            Kai:
            for(int j = i-1; j>=-1; j--){
              
                if(j == -1){
                    ar[0] = v;
                }
                else if(v<ar[j]){
                    ar[j+1] = ar[j];
                }
                else{ 
                    ar[j+1] = v;
                    break Kai;
                    
                }
            }
            printArray(ar);
            
        }
            
    }
    /*This method is shown in HR
     * public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j > 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            if(j==0 && A[j]>value){
                A[j+1]=A[j];
                A[j]=value;
            }
            else A[j + 1] = value;
            
        }

        printArray(A);
    }*/
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}


