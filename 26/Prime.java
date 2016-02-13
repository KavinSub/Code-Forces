import java.util.*;

public class Prime{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n < 2){
			System.out.println(0);
		}else{
			boolean[] sieve = generateSieve(n);
			// Create a list of primes
			ArrayList primes = new ArrayList();
			for(int i = 0; i < sieve.length; i++){
				if(sieve[i] == true){
					primes.add(i);
				}
			}

			// For all numbers 1 to n
			int count = 0;
			for(int i = 1; i <= n; i++) if(countPrimes(i, primes) == 2) count++;

			System.out.println(count);
		}
	}

	// generates prime number sieve upto n
	public static boolean[] generateSieve(int n){
		boolean[] sieve = new boolean[n + 1];

		// Set all i initially to true
		for(int i = 0; i < sieve.length; i++) sieve[i] = true;
		sieve[0] = false;
		sieve[1] = false;

		int max = (int) Math.sqrt(n);
		int i = 2;
		while(i <= max){
			int k = i;
			while(k <= n){
				if(k % i == 0 && k != i) sieve[k] = false;
				k += i;
			}
			i++;
			while(sieve[i] == false) i++;
		}

		return sieve;
	}

	// Counts number of primes k is divisible by
	public static int countPrimes(int k, ArrayList primes){
		int count = 0;
		for(int i = 0; i < primes.size(); i++) if(k % (int) primes.get(i) == 0 && k != (int) primes.get(i)) count += 1;
		return count; 
	}
}