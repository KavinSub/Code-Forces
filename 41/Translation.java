import java.util.*;

public class Translation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		StringBuilder builder = new StringBuilder(a);
		if(builder.reverse().toString().equals(b)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}