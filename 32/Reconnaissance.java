import java.util.*;

public class Reconnaissance{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		// Read in heights
		int[] h = new int[n];
		for(int i = 0; i < n; i++) h[i] = scan.nextInt();

		int count = 0;
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if((int) Math.abs(h[i] - h[j]) <= d) count += 2;
			}
		}

		System.out.println(count);
	}
}