import java.util.*;

public class Noldbach{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		// First create a prime number sieve
		boolean[] sieve = generateSieve(n);

		// Now create an arraylist of all primes
		ArrayList p = new ArrayList();
		for(int i = 0; i < sieve.length; i++){
			if(sieve[i] == true){
				p.add(i);
			}
		}

		// Verify the noldbach conjecture for each prime
		int count = 0;
		for(int i = 0; i < p.size(); i++){
			int prime = (int) p.get(i);
			// For each prime below p
			for(int j = 0; j < i - 1; j++){
				if((int) p.get(j) + (int) p.get(j + 1) == prime - 1) count += 1;
			}
		}

		if(count >= k){
			System.out.println("YES");
		}else{
			System.out.println("NO");
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
		while(i < max){
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
}