import java.util.*;
public class Triangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// Read input
		int[] l = new int[4];
		for(int i = 0; i < 4; i++) l[i] = scan.nextInt();

		// All possible triangles
		int[][] triangles = {
							{l[0], l[1], l[2]},
							{l[0], l[1], l[3]},
							{l[0], l[2], l[3]},
							{l[1], l[2], l[3]}
							};

		boolean triangle = false;
		boolean degenerate = false;
		for(int i = 0; i < triangles.length; i++){
			int a = triangles[i][0];
			int b = triangles[i][1];
			int c = triangles[i][2];
			if(isTriangle(a, b, c)){
				triangle = true;
			}
			if(isDegenerate(a, b, c)){
				degenerate = true;
			}
		}

		if(triangle){
			System.out.println("TRIANGLE");
		}else if(degenerate){
			System.out.println("SEGMENT");
		}else{
			System.out.println("IMPOSSIBLE");
		}
	}

	public static boolean isTriangle(int a, int b, int c){
		return (a + b > c && a + c > b && b + c > a);
	}

	public static boolean isDegenerate(int a, int b, int c){
		return (a + b == c || a + c == b || b + c == a);
	}

}