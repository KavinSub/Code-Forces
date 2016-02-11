import java.util.*;

public class Sequence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// Read input
		int n = scan.nextInt();
		int d = scan.nextInt();

		long[] b = new long[n];
		for(int i = 0; i < n; i++) b[i] = scan.nextLong();


		// Count optimal moves needed
		int m = 0;

		for(int i = 1; i < n; i++){
			long diff = b[i - 1] - b[i];
			if(diff == 0){
				m += 1;
				b[i] += d;
			}else if(diff > 0){
				long k = (long) diff / d;
				m += k;
				b[i] += (d * k);
				if(b[i] <= b[i - 1]){
					m += 1;
					b[i] += d;
				}
			}
		}
		System.out.println(m);
	}
}