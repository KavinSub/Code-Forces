import java.util.*;
import java.util.regex.*;

public class Jabber{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine();

		// Do regex matching
		String pattern = "^[\\w]{1,16}@((?:[\\w]{1,16}\\.)+[\\w]{1,16})(\\/[\\w]{1,16})?$";
		Pattern r = Pattern.compile(pattern);

		Matcher m = r.matcher(email);
		if(m.find()){
			if(m.group(1).length() >= 1 &&  m.group(1).length() <= 32){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			System.out.println("NO");
		}
	}
}