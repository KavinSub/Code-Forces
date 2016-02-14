import java.util.*;

public class Reconnaissance{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int[] h = new int[n];
		for(int i = 0; i < n; i++) h[i] = scan.nextInt();

		// Create diff array, diff[i] = abs(h[i + 1] - h[i])
		int[] diff = new int[n];
		for(int i = 0; i < n; i++) diff[i] = Math.abs(h[(i + 1) % n] - h[i]);
		
		// Now find the min index
		int index = 0;
		int min = diff[0];

		for(int i = 0; i < diff.length; i++){
			if(diff[i] < min){
				index = i;
				min = diff[i];
			}
		}

		System.out.printf("%d %d\n", index + 1, (index + 1) % n + 1);
	}
}