
public class Solution {
	public static int countPrime(int n){
		boolean[] primes = new boolean[n];
		for(int i = 2; i < n; i++){
			primes[i] = true;
		}
		for(int i = 2; i < n; i++){
			if(primes[i]){
				for(int j = i + i /* 2*i */ ; j < n; j = j + i){
					primes[j] = false;
				}
			}
		}
		int count = 0;
		for(int i = 2; i < n; i++){
			if(primes[i]) count++;
		}
		return count;
	}
	public static void main(String[] args){
		int count = countPrime(20);
		System.out.println(count);
	}
}
