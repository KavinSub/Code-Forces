import java.util.*;

public class Worms{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// Read input
		int n = scan.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) l[i] = scan.nextInt();

		for(int i = 0; i < l.length; i++){
			for(int j = 0; j < l.length; j++){
				for(int k = 0; k < l.length; k++){
					if(l[i] == l[j] + l[k]){
						if(j != i && k != i && j != k){
							System.out.printf("%d %d %d\n", i + 1, j + 1, k + 1);
							return;
						}
					}
				}
			}
		}

		System.out.println(-1);
	}
}