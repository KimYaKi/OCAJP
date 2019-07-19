
public class Q89 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 1 2 3 4
		      followed by an ArrayIndexOutOfBoundsException
		 * B. 1 2 3
		 * C. 1 2 3 4
		 * D. Compilation fails.
		 */
		
		int[] arr = { 1, 2, 3, 4 };
		int i = 0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		} while (i < arr.length - 1);
		
		// Answer : B
	}

}
