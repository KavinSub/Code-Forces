import java.util.*;

public class Statistics{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] seq = new int[n];
		for(int i = 0; i < n; i++) seq[i] = scan.nextInt();
		Arrays.sort(seq);

		// Now get the second element
		int f = seq[0];
		int i = 1;
		while(i < n){
			if(seq[i] != f) break;
			i++;
		}
		System.out.println(i < n ? seq[i]:"NO");
	}
}