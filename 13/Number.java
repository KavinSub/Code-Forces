import java.util.*;
public class Number{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		// Running count of sums of numbers
		int sum = 0;
		int nums = a - 2;

		for(int i = 2; i < a; i++){
			ArrayList list = convertBase(a, i);
			sum += sumList(list);
		}

		int d = gcd(sum, nums);
		System.out.printf("%d/%d\n", sum/d, nums/d);
	}

	// Converts a decimal value m to the specified base n
	public static ArrayList convertBase(int m, int n){
		ArrayList result = new ArrayList();
		while(true){
			if(m < n){
				result.add(Integer.toString(m));
				break;
			}else{
				result.add(Integer.toString(m % n));
				m = m/n;
			}
		}
		return result;
	}

	// Computes the gcd of two numbers
	public static int gcd(int a, int b){
		while(b != 0){
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	// Sums an arraylist of strings 
	public static int sumList(ArrayList list){
		int sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum += Integer.parseInt(list.get(i).toString());
		}
		return sum;
	}
}