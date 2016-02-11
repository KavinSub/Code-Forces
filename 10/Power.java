import java.util.*;

public class Power{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// Read in constants
		int n = scan.nextInt();
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int p3 = scan.nextInt();
		int t1 = scan.nextInt();
		int t2 = scan.nextInt();

		int[] l = new int[n];
		int[] r = new int[n];
		// Read in intervals
		for(int i = 0; i < n; i++){
			l[i] = scan.nextInt();
			r[i] = scan.nextInt();
		}

		// Stores power consumed
		int pc = 0;

		// For all but the last interval
		for(int i = 0; i < n - 1; i++){
			pc += p1 * (r[i] - l[i]);
			int left = l[i + 1] - r[i];

			// If the laptop has time to go to screensaver mode
			if(left > t1){
				pc += t1 * p1;
				left -= t1;
				if(left > t2){
					pc += t2 * p2;
					left -= t2;
					pc += left * p3;
				}else{
					pc += left * p2;
				}
			}else{
				pc += left * p1;
			}
		}

		pc += p1 * (r[n - 1] - l[n - 1]);
		System.out.println(pc);
	}
}