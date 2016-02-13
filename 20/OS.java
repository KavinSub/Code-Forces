import java.util.*;

public class OS{
	public static void main(String[] args){
		int k = 1;
		Scanner scan = new Scanner(System.in);
		String[] dirs = scan.nextLine().split("/+");
		System.out.println(join("/", dirs));
	}

	public static String join(String div, String[] dirs){
		if(dirs.length == 0) return "/";
		
		String r = "";
		for(int i = 0; i < dirs.length - 1; i++) r += dirs[i] + div;
		r += dirs[dirs.length - 1];
		return r;
	}
}