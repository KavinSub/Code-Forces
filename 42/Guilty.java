import java.util.*;

public class Guilty{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v = scan.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for(int i = 0; i < n; i++) a[i] = scan.nextInt();
		for(int i = 0; i < n; i++) b[i] = scan.nextInt();

		// Calculate smallest proportions
		float c = ((float) b[0])/a[0];
		for(int i = 0; i < n; i++) c = Math.min(c, ((float) b[i])/a[i]);

		// Now sum c factor times ingredients
		float sum = 0;
		for(int i = 0; i < n; i++) sum += c * ((float) a[i]);
		System.out.println(Math.min(sum, (float) v));
	}
}