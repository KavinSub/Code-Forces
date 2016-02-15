import java.util.*;

public class Presents{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		HashSet p = new HashSet();

		int c = scan.nextInt();
		int[] h = new int[c];
		for(int i = 0; i < c; i++){
			int temp = scan.nextInt();
			p.add(temp);
			h[i] = temp;
		}

		
		int i = 0;
		while(true){
			i += k;
			if(i > n) break;
			p.add(i);
		}

		System.out.println(p.size());
	}
}