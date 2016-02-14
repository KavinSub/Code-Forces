import java.util.*;

public class Towers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] seq = new int[n];
		for(int i = 0; i < n; i++) seq[i] = scan.nextInt();

		Hashtable table = new Hashtable();
		HashSet set = new HashSet();

		for(int i = 0; i < n; i++){
			int num = seq[i];

			if(!table.containsKey(num)){
				table.put(num, 1);
			}else{
				table.put(num, (int) table.get(num) + 1);
			}

			set.add(num);
		}

		// Get max height
		Collection<Integer> heightCollection = table.values();
		Integer[] heights = heightCollection.toArray(new Integer[0]);
		Arrays.sort(heights);
		int h = heights[heights.length - 1];

		// Get number of towers
		int t = set.size();

		System.out.printf("%d %d\n", h, t);
	}
}