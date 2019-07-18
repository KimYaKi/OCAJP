
public class Q54 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Compilation fails.
		 
		 * B. 1 3
		      1 3
		      
		 * C. 1 3
		      followed by an ArrayIndexOutOfBoundsException
		      
		 * D. 1 3
		      1 3 0 0
		      
		 * E. 1 3 5 7
		      1 3
		 */
		
		int[][] arr = new int[2][4];
		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 1, 3 };
		
		for(int[] a : arr) {
			for(int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		// Answer : E
	}

}
