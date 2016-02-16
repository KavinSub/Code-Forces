import java.util.*;

public class Presents{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		// Array of presents
		boolean[] presents = new boolean[n + 1];
		for(int i = 0; i < 1; i++) presents[i] = false;

		int c = scan.nextInt();
		for(int i = 0; i < c; i++){
			int p = scan.nextInt();
			presents[p] = true;
		}

		int count = 0;
		for(int i = 1; i <= n; i++){
			count += 1;
			if(presents[i] == true) count = 0;
			if(count == k){
				presents[i] = true;
				count = 0;
			}
		}

		int p = 0;
		for(int i = 0; i < presents.length; i++) if(presents[i] == true) p += 1;

		System.out.println(p);
	}
}