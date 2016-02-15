import java.util.*;

public class Sleuth{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String q = scan.nextLine().replaceAll("[\\W]","").toLowerCase();
		String vowels = "aeiuoy";
		if(vowels.indexOf(q.charAt(q.length() - 1)) != -1) System.out.println("YES");
		else System.out.println("NO");
	}
}