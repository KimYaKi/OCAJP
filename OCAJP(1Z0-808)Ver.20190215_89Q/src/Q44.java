
public class Q44 {
	public static void main(String[] args) {
		
		// Which three code fragments can be independently inserted at line n1 to enable the code to print one? (Choose 3)
		/**
		 * A. Byte x = 1;
		 * B. short x = 1;
		 * C. String x = "1";
		 * D. Long x = 1;
		 * E. Double x = 1;
		 * F. Integer x = new Integer("1");
		 */
		
		int x = 1;	// line n1
		
		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		}
		
		// Answer : A, B, F
	}
}
