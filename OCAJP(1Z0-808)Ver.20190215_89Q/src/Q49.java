
public class Q49 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 1324
		 * B. 2413
		 * C. 3142
		 * D. 4231
		 */
		
		int n[][] = { { 1, 3 }, { 2, 4 } };
		
		for(int i = n.length-1; i >= 0; i--) {
			for(int y : n[i]) {
				System.out.print(y);
			}
		}
		
		// Answer : B
	}

}
