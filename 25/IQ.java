import java.util.*;

public class IQ{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] seq = new int[n];
		for(int i = 0; i < n; i++) seq[i] = scan.nextInt();
		ArrayList evens = new ArrayList();
		ArrayList odds = new ArrayList();
		for(int i = 0; i < n; i++){
			if(seq[i] % 2 == 0) evens.add(i);
			else odds.add(i);
		}
		System.out.println((evens.size() == 1) ? (int) evens.get(0) + 1 : (int) odds.get(0) + 1);
	}
}