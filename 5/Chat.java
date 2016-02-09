import java.util.*;
public class Chat{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int bytes = 0;

		while(scan.hasNext()){
			String[] input = scan.nextLine().split(":");
			if(input.length == 2){
				bytes += input[1].length() * count;
			}else{
				if(input[0].charAt(0) == '+'){
					count += 1;
				}else if(input[0].charAt(0) == '-'){
					count -= 1;
				}
			}
		}

		System.out.println(bytes);
	}
}