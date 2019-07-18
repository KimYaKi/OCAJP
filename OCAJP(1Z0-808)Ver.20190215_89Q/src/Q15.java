
public class Q15 {
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 100
		 * B. 101
		 * C. 102
		 * D. 103
		 * E. Compilation false
		 */
		
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		/**
		 * Original Code in line 22
		 * int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;	// compile Error
		 */
		int d = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println(d);
		
		// Answer : E
	}
}
