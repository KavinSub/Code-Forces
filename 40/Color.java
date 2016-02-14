import java.util.*;

public class Color{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		double radius = radius(x, y);

		int color = 0;
		if(radius == Math.floor(radius)){
			color = 1;
		}else{
			// 1 for black, -1 for white
			color = (int) Math.pow(-1, (int) radius) * (x * y / (int) Math.abs(x * y));
		}
		if(color == 1){
			System.out.println("black");
		}else{
			System.out.println("white");
		}

	}

	public static double radius(int x, int y){
		return Math.sqrt(x * x + y * y);
	}
}