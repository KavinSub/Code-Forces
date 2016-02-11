import java.util.*;

public class Village{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();

		// Read in the houses
		House[] hs = new House[n];
		for(int i = 0; i < n; i++){
			int x = scan.nextInt();
			int a = scan.nextInt();
			hs[i] = new House(x, a);
		}

		// Edge case of only one house
		if(n == 1){
			System.out.println(2);
			return;
		}

		// Sort the houses by their x position
		Arrays.sort(hs);

		// Now check the left and right sides of each house
		int count = 0;
		for(int i = 0; i < n; i++){
			if(i == 0){ // Only check the right side of the first house
				count += 1;
				if(checkRightHouse(hs[i], hs[i + 1], t)) count += 1;
			}else if(i == n - 1){ // Only check left side of last house
				count += 1;
				if(checkLeftHouse(hs[i - 1], hs[i], t)) count += 1;
			}else{
				if(checkRightHouse(hs[i], hs[i + 1], t)) count += 1;
				if(checkLeftHouse(hs[i - 1], hs[i], t)) count += 1;
			}
		}

		System.out.println(count);
	}

	public static boolean checkRightHouse(House l, House r, int size){
		return ((float) l.x) + (l.size/2.0) + size <= ((float) r.x - (r.size/2.0));
	}

	public static boolean checkLeftHouse(House l, House r, int size){
		return ((float) r.x - (r.size/2.0) - size) > ((float) l.x + (l.size/2.0));
	}
}

class House implements Comparable<House>{
	int x;
	int size;

	public House(int x, int size){
		this.x = x;
		this.size = size;
	}

	public String toString(){
		return String.format("x: %d, size: %d", x, size);
	}

	public int compareTo(House o){
		return this.x -  o.x;
	}
}