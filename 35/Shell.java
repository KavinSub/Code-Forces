import java.util.*;
import java.io.*;

public class Shell{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("input.txt"));
		int index = scan.nextInt();
		boolean[] t = new boolean[3];
		for(int i = 0; i < t.length; i++) t[i] = false;
		t[index - 1] = true;

		// Perform swaps
		for(int i = 0; i < 3; i++){
			int k = scan.nextInt() - 1;
			int l = scan.nextInt() - 1;
			swap(t, k, l);
		}

		// Create output writer
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

		// Output answer
		for(int i = 0; i < 3; i++) if(t[i] == true) bw.write(Integer.toString(i + 1));
		bw.close();
	}

	// Swaps indices i and j of a
	public static void swap(boolean[] a, int i, int j){
		boolean temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}