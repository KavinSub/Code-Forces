import java.util.*;

public class Triangle{

	public static final double epsilon = 0.000001; 

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] triangle = new int[6];
		for(int i = 0; i < triangle.length; i++) triangle[i] = scan.nextInt();

		if(allSame(triangle)){ // Check this stupid edge case
			System.out.println("NEITHER");
		}else if(isRightTriangle(triangle)){ // Check if we have a right triangle at all
			System.out.println("RIGHT");
		}else{
			// Now check the other possibilities
			boolean almost = false;
			for(int i = 0; i < triangle.length; i++){
				// Add 1 to each coordinate, test 
				triangle[i] += 1;
				if(isRightTriangle(triangle)){
					almost = true;
					break;
				}
				// Now subtract 1 from each coordinate, test
				triangle[i] -= 2;
				if(isRightTriangle(triangle)){
					almost = true;
					break;
				}
				triangle[i] += 1;
			}
			if(almost){
				System.out.println("ALMOST");
			}else{
				System.out.println("NEITHER");
			}
		}
	}
	
	// Checks if the triangle is a right triangle
	public static boolean isRightTriangle(int[] triangle){
		double sides[] = new double[3];
		sides[0] = dist(triangle[0], triangle[1], triangle[2], triangle[3]);
		sides[1] = dist(triangle[0], triangle[1], triangle[4], triangle[5]);
		sides[2] = dist(triangle[2], triangle[3], triangle[4], triangle[5]);

		// Hypotenuse will be longest side; last element
		Arrays.sort(sides);

		// Now check if the sides form a pythagorean triple
		return sides[0] > 0 && doubleEquals(sides[2], sides[0] + sides[1]);
	}

	public static double dist(int x1, int y1, int x2, int y2){
		return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
	}

	public static boolean doubleEquals(double a, double b){
		return Math.abs(a - b) < epsilon;
	}

	public static boolean allSame(int[] triangle){
		HashSet set = new HashSet();
		for(int i = 0; i < triangle.length; i++) set.add(triangle[i]);
		return set.size() == 1;
	}
}