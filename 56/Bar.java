import java.util.*;

public class Bar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String[] alcohol = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
		HashSet<String> s = new HashSet(Arrays.asList(alcohol)); 

		int count = 0;
		for(int i = 0; i < n; i++){
			String token = scan.next();
			if(token.charAt(0) <= 57){
				if(Integer.parseInt(token) < 18) count += 1;
			}else{
				if(s.contains(token)) count += 1;
			}
		}

		System.out.println(count);
	}
}