import java.util.*;

public class Spit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// Create an array and hashtable of camels
		Camel[] camels = new Camel[n];
		Hashtable pos = new Hashtable();
		for(int i = 0; i < n; i++){
			int x = scan.nextInt();
			int d = scan.nextInt();
			camels[i] = new Camel(x, d);
			pos.put(x, camels[i]);
		}

		boolean spit = false;
		for(int i = 0; i < camels.length; i++){
			int p = camels[i].spitPos();
			Camel camel = (Camel) pos.get(p);
			if(camel != null && camel.spitPos() == camels[i].x) spit = true;
		}
		System.out.println(spit ? "YES" : "NO");

	}
}

class Camel{
	int x;
	int d;

	public Camel(int x, int d){
		this.x = x;
		this.d = d;
	}

	public int spitPos(){
		return this.x + this.d;
	}

	public String toString(){
		return String.format("Located at %d, spits %d.", this.x, this.d);
	}
}