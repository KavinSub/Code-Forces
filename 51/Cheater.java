import java.util.*;

public class Cheater{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		HashSet<String> s = new HashSet();

		for(int i = 0; i < n; i++){
			String d = scan.next();
			d += (new StringBuilder(scan.next())).reverse().toString();

			if(s.size() == 0){
				s.add(d);
			}else{
				boolean contains = false;
				String[] dominoes = s.toArray(new String[0]);
				for(int j = 0; j < dominoes.length; j++){
					String temp = dominoes[j] + dominoes[j];
					if(temp.indexOf(d) != -1){
						contains = true;
						break;
					}
				}
				if(!contains) s.add(d);
			}

			if(i != n - 1) scan.next();
		}

		System.out.println(s.size());
	}
}