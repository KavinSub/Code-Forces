import java.util.*;

public class RPS{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int f = moveValue(scan.next());
		int m = moveValue(scan.next());
		int s = moveValue(scan.next());

		if((f == m && m == s) || (f != m && f != s && m != s)){
			System.out.println("?");
		}else{
			if(f == m){
				if(compare(s, f)){
					System.out.println("S");
				}else{
					System.out.println("?");
				}
			}else if(m == s){
				if(compare(f, m)){
					System.out.println("F");
				}else{
					System.out.println("?");
				}
			}else{
				if(compare(m, s)){
					System.out.println("M");
				}else{
					System.out.println("?");
				}
			}
		}

	}

	// rock = 0, scissors = 1, paper = 2
	public static int moveValue(String move){
		if(move.equals("rock")){
			return 0;
		}else if(move.equals("scissors")){
			return 1;
		}else{
			return 2;
		}
	}

	// Returns true if a beats b
	public static boolean compare(int a, int b){
		return (a + 1) % 3 == b;
	}
}