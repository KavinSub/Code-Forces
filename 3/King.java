import java.util.*;

public class King{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList moves = new ArrayList();

		int[] c = coordinates(scan.next());
		int[] d = coordinates(scan.next());

		while(c[0] != d[0] || c[1] != d[1]){
			int[] pair = {0, 0};
			if(c[0] != d[0]){
				pair[0] = (d[0] - c[0])/(Math.abs(d[0] - c[0]));
			}
			if(c[1] != d[1]){
				pair[1] = (d[1] - c[1])/(Math.abs(d[1] - c[1]));
			}

			moves.add(pair);

			c[0] += pair[0];
			c[1] += pair[1];
		}
		
		System.out.println(moves.size());
		for(int i = 0; i < moves.size(); i++){
			System.out.println(command((int[]) moves.get(i)));
		}

	}

	public static int[] coordinates(String c){
		int[] pair = new int[2];
		pair[0] = c.charAt(0) - 96;
		pair[1] = c.charAt(1) - 48;
		return pair;
	}

	public static String command(int[] p){
	 	String c = "";
		if(p[0] == -1){
			c += "L";
		}else if(p[0] == 1){
			c += "R";
		}
		if(p[1] == -1){
			c += "D";
		}else if(p[1] == 1){
			c += "U";
		}
		return c;
	}
}