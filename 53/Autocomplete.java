import java.util.*;

public class Autocomplete{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = scan.nextInt();

		String[] words = new String[n];
		for(int i = 0; i < n; i++) words[i] = scan.next();

		Arrays.sort(words);

		for(int i = 0; i < n; i++){
			if(words[i].indexOf(s) == 0){
				System.out.println(words[i]);
				return;
			}
		}

		System.out.println(s);
	}
}