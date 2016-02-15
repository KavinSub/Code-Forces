import java.util.*;

public class Codecraft{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String m = scan.next();
		int k = scan.nextInt();

		String[] months = {"January",
						   "February",
						   "March",
						   "April",
						   "May",
						   "June",
						   "July",
						   "August",
						   "September",
						   "October",
						   "November",
						   "December"};
		int s = -1;
		for(int i = 0; i < months.length; i++) if(months[i].equals(m)) s = i;
		System.out.println(months[(s + k) % months.length]);
	}
}