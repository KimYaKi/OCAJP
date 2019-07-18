
public class Q51 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Answer = 0
		 * B. Invalid calculation
		 * C. Compilation fails only at line n1.
		 * D. Compilation fails only at line n2.
		 * D. Compilation fails only at line n1 and line n2.
		 */
		
		try {
			int num = 10;
			int div = 0;
			int ans = num/ div;
		}catch(ArithmeticException ae) {
			//ans = 0;									// line n1
		}catch(Exception e) {
			System.out.println("Invalid calculation");
		}
		//System.out.println("Answer = " + ans);		// line n2
		
		// Answer : E
	}

}
