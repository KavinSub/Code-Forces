import java.util.*;

public class Agent{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String c = "";
		for(int i = 0; i < 3; i++) c += scan.next();
		StringBuilder builder = new StringBuilder(c);
		String cr = builder.reverse().toString();
		if(cr.equals(c)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}