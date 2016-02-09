import java.util.Scanner;
public class Die{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int c = Math.max(x, y);
		
		int n = -1;
		int d = -1;
		switch(c){
			case 1:
				n = 1;
				d = 1;
				break;
			case 2:
				n = 5;
				d = 6;
				break;
			case 3:
				n = 2;
				d = 3;
				break;
			case 4:
				n = 1;
				d = 2;
				break;
			case 5:
				n = 1;
				d = 3;
				break;
			case 6:
				n = 1;
				d = 6;
				break;
		}
		System.out.printf("%d/%d\n", n, d);
	}
}