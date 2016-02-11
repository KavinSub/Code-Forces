import java.util.*;

public class Flag{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		String prev = scan.next();
		if(!checkSet(prev)){
			System.out.println("NO");
			return;
		}

		for(int i = 1; i < n; i++){
			String curr = scan.next();
			if(!checkSet(curr)){
				System.out.println("NO");
				return;
			}
			if(curr.equals(prev)){
				System.out.println("NO");
				return;
			}
			prev = curr;
		}

		System.out.println("YES");

	}

	public static boolean checkSet(String row){
		HashSet set = new HashSet();
		for(int i = 0; i < row.length(); i++){
			set.add(row.charAt(i));
		}
		return set.size() == 1;
	}
}