
public class Q23 {
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Compilation fails.
		 * B. false true
		 * C. true false
		 * D. true true
		 * E. false false
		 */
		
		Q23 ts = new Q23();
		System.out.print(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
		
		// Answer B
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;
}
