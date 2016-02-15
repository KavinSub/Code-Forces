import java.util.*;

public class Football{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Hashtable t = new Hashtable();
		for(int i = 0; i < n; i++){
			String team = scan.next();
			if(t.containsKey(team)){
				t.put(team, (int) t.get(team) + 1);
			}else{
				t.put(team, 1);
			}
		}

		int max = 0;
		String max_team = "";

		Enumeration<String> keys = t.keys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			int score = (int) t.get(key);
			if(score > max){
				max = score;
				max_team = key;
			}
		}
		System.out.println(max_team);
	}
}