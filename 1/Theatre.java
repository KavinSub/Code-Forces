import java.util.Scanner;
public class Theatre{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n, m, a;
		n = scan.nextInt();
		m = scan.nextInt();
		a = scan.nextInt();

		long width = (long) Math.ceil(((double) n) / a);
		long height = (long) Math.ceil(((double) m)/ a);
		System.out.println(width * height);
	}
}