import java.util.*;

public class Triangular{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = 1;
		int c = 2;
		while(s <= k){
			if(s == k){
				System.out.println("YES");
				return;
			}
			s += c;
			c += 1;
		}

		System.out.println("NO");
	}
}