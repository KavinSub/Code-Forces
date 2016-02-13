import java.util.*;

public class Accounting{

	public static final double eps = 0.00001;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();

		double f = (double) b / (double) a;
		if(f < 0 && n % 2 == 0){
			System.out.println("No solution");
		}else{
			if(f < 0 && n % 2 == 1){
				double result = Math.pow(-1 * f, 1.0/(double) n);
				if(doubleEquals(result, Math.round(result))){
					System.out.println((int) (-1.0 * Math.round(result)));
				}else{
					System.out.println("No solution");
				}
			}else if(a == 0 && b == 0){
				System.out.println(5);
			}else if(a == 0 && b != 0){
				System.out.println("No solution");
			}else if(a != 0 && b == 0){
				System.out.println(0);
			}else{
				double result = Math.pow(f, 1.0/(double) n);
				if(doubleEquals(result, Math.round(result))){
					System.out.println((int) Math.round(result));
				}else{
					System.out.println("No solution");
				}
			}
		}
	}

	public static boolean doubleEquals(double a, double b){
		return Math.abs(a - b) < eps;
	}
}