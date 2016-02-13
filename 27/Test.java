import java.util.*;

public class Test{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// Create set
		HashSet seq = new HashSet();
		for(int i = 0; i < n; i++) seq.add(scan.nextInt());

		// Now find smallest index
		int i = 1;
		while(seq.contains(i)) i++;
		System.out.println(i);
	}
}