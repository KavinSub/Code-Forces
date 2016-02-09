import java.util.*;

public class Chess{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		HashSet set = new HashSet();

		// Read in board
		String[] b = new String[8];
		for(int i = 0; i < b.length; i++) b[i] = scan.next();

		// Count of all black columns and rows
		int count = 0;

		// Count all black rows
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length(); j++){
				set.add(b[i].charAt(j));
			}
			if(allBlack(set)) count += 1;
			set.clear();
		}

		// Count all black columns
		for(int i = 0; i < b[0].length(); i++){
			for(int j = 0; j < b.length; j++){
				set.add(b[j].charAt(i));
			}
			if(allBlack(set)) count += 1;
			set.clear();
		}
		// Print the count
		System.out.println(count == 16 ? 8 : count);
	}

	public static boolean allBlack(HashSet set){
		return (set.size() == 1 && set.contains('B'));
	}
}