public class QuickSort {
	public static void xchange(int[] a,int x,int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static int partition(int[] a,int p, int r){
		int pivot = a[r]; //pivot is last element.
		int i = p - 1;
		for(int j = p; j < r; j++){
			if(a[j]<=pivot){
				i++;
				xchange(a, i, j);
			}
		}	
		xchange(a, i+1, r);
		return i+1;
	}
	public static void quicksort(int[] a,int p,int r){
		if(p < r){
			int q = partition(a,p,r);
			quicksort(a,p,q-1);
			quicksort(a,q+1,r);
		}
	}
	public static void main(String[] args){
		int[] a = {0,7,5,3,4,6,1,2};
		quicksort(a,0,a.length-1);
		for(int x : a){
			System.out.print(x + " ");
		}
	}

}
