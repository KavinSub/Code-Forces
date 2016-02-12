import java.util.*;

public class OS{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] dirs = scan.nextLine().split("/+");
		System.out.println(String.join("/", dirs));
	}
}