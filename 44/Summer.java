import java.util.*;

public class Summer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		HashSet l = new HashSet();
		for(int i = 0; i < n; i++){
			l.add(scan.nextLine());
		}
		System.out.println(l.size());
	}
}