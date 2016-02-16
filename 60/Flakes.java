import java.util.*;

public class Flakes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int hints = scan.nextInt();
		scan.nextLine();

		int left = n + 1;
		int right = 0;

		for(int i = 0; i < hints; i++){
			String[] tokens = scan.nextLine().split(" ");
			String dir = tokens[2];
			int box = Integer.parseInt(tokens[4]);
			
			if(dir.equals("left")) left = (int) Math.min(left, box);
			else right = (int) Math.max(right, box);
		}

		if(left - right <= 1){
			System.out.println(-1);
		}else{
			System.out.println(left - right - 1);
		}

	}
}