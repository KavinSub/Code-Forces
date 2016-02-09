import java.util.*;

public class Train{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		String m = scan.next();
		String x = scan.next();
		String y = scan.next();

		// Control variables
		boolean forward = false;
		boolean backward = false;
		//System.out.printf("%s %s %s\n", m, x, y);
		int s  = -1;

		// Check if sequence exists in forward
		s = m.indexOf(x);
		if(s != -1){
			s = m.indexOf(y, s + x.length());
			if(s != -1){
				forward = true;
			}
		}

		// Create a reversed string
		StringBuilder b = new StringBuilder(m);
		String r = b.reverse().toString();
		
		// Check if sequence exists in backward
		s = r.indexOf(x);
		if(s != -1){
			s = r.indexOf(y, s + x.length());
			if(s != -1){
				backward = true;
			}
		}

		if(forward && backward){
			System.out.println("both");
		}else if(forward){
			System.out.println("forward");
		}else if(backward){
			System.out.println("backward");
		}else{
			System.out.println("fantasy");
		}
	}
}