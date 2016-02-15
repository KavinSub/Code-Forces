import java.util.*;

public class Ball{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int s = 0, d = 1;
		for(int i = 0; i < n - 1; i++){
			s = ((s + d) % n);
			System.out.printf("%d ", s + 1);
			d++;
		}
	}
}