import java.util.*;

public class Word{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int up = 0;
		int low = 0;

		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);

			if(c >= 'A' && c <= 'Z') up++;
			if(c >= 'a' && c <= 'z') low ++;
		}

		System.out.println(up <= low ? word.toLowerCase() : word.toUpperCase());
	}
}