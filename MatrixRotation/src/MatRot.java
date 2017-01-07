import java.io.*;
import java.util.*;
public class MatRot {
	public static void main(String[] args){
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		int n = matrix.length;
		for(int i = 0; i < n/2; i++){
			for(int j = 0; j < Math.ceil((double)n/2.0); j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		for(int[] x : matrix){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
