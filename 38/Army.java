import java.util.*;

public class Army{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int diff[] = new int[n - 1];
		for(int i = 0; i < n - 1; i++) diff[i] = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		int sum = 0;
		int srank = a - 1;
		int erank = b - 1;
		for(int i = srank; i < erank; i++){
			sum += diff[i];
		}
		System.out.println(sum);
	}
}