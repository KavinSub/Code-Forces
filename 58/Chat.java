import java.util.*;
import java.util.regex.*;

public class Chat{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		String pattern = ".*h.*e.*l.*l.*o";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(word);

		System.out.println(m.find() ? "YES" : "NO");
	}
}