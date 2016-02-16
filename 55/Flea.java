import java.util.*;

public class Flea{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		HashSet p = new HashSet();

		int t = 0;
		for(int i = 0; i <= n; i++){
			t += i;
			p.add(t % n);
		}

		System.out.println(p.size() == n ? "YES" : "NO");
	}
}