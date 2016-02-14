import java.util.*;

public class Dinner{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();

		// Now place the weakest teeth in a hashtable
		Hashtable teeth = new Hashtable();
		for(int i = 0; i < n; i++){
			int r = scan.nextInt();
			int c = scan.nextInt();
			if(teeth.containsKey(r)){
				teeth.put(r, Math.min(c, (int) teeth.get(r)));
			}else{
				teeth.put(r, c);
			}
		}

		Collection<Integer> rows = teeth.values();
		Integer[] mins = rows.toArray(new Integer[0]);

		int sum = 0;
		for(int i = 0; i < mins.length; i++) sum += mins[i].intValue();
		System.out.println(Math.min(sum, k));
	}
}