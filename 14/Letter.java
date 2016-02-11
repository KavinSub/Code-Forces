import java.util.*;

public class Letter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int lx = m;
		int hx = 0;
		int ly = n;
		int hy = 0;

		char[][] l = new char[n][m];
		for(int i = 0; i < n; i++){
			String line = scan.next();
			for(int j = 0; j < m; j++){
				l[i][j] = line.charAt(j);
				if(l[i][j] == '*'){
					lx = Math.min(j, lx);
					hx = Math.max(j, hx);
					ly = Math.min(i, ly);
					hy = Math.max(i, hy);
				}
			}
		}

		for(int i = ly; i <= hy; i++){
			for(int j = lx; j <= hx; j++){
				System.out.print(l[i][j]);
			}
			System.out.println();
		}

	}
}