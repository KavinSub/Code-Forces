import java.util.*;

public class Sequence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] c = new int[3];

		String[] nums = scan.nextLine().split(" ");

		for(int i = 0; i < n; i++) c[Integer.parseInt(nums[i]) - 1] += 1;

		int max = 0;
		for(int i = 0; i < c.length; i++) if(c[i] > c[max]) max = i;
		System.out.println(n - c[max]);
	}
}