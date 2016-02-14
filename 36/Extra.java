import java.util.*;
import java.io.*;

public class Extra{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("input.txt"));
		int n = scan.nextInt();
		String seq = scan.next();

		/* 0 -> Start
		   1 -> Off
		   2 -> On
		*/
		int state = 0;
		int count = 0;

		// ArrayList of intervals
		ArrayList intervals = new ArrayList();

		for(int i = 0; i < n; i++){
			char c = seq.charAt(i);
			if(state == 0){
				if(c == '1'){
					state = 2;
					if(count > 0){
						intervals.add(count);
					}
				}else{
					count += 1;
				}
			}else if(state == 1){
				if(c == '0'){
					count += 1;
				}else{
					state = 2;
					intervals.add(count);
				}
			}else if(state == 2){
				if(c == '0'){
					state = 1;
					count = 1;
				}
			}
		}

		// Create set of interval gaps
		HashSet s = new HashSet();
		for(int i = 0; i < intervals.size(); i++){
			s.add((int) intervals.get(i));
			System.out.println((int) intervals.get(i));
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));

		bw.write(s.size() <= 1 ? "YES" : "NO");
		bw.close();
	}
}