import java.util.*;


public class Winner{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Hashtable table = new Hashtable(); 
		ArrayList list = new ArrayList();

		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String key = scan.next();
			String value = scan.next();
			if(table.containsKey(key)){
				table.put(key, (int) table.get(key) + Integer.parseInt(value));
			}else{
				table.put(key, Integer.parseInt(value));
			}
			String[] round = {key, Integer.toString((int) table.get(key))};
			list.add(round);
		}
		
		int max = (int) Collections.max(table.values());
		for(int i = 0; i < list.size(); i++){
			String[] pair = (String[]) list.get(i);
			if(Integer.parseInt(pair[1]) >= max && (int) table.get(pair[0]) == max){
				System.out.println(pair[0]);
				break;
			}
		}
	}
}