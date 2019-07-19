
public class Q74 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. An exception is thrown at runtime.
		 * B. Compilation fails.
		 * C. 13480.0
		 * D. 13480.02
		 */
		
		float var1 = (12345.01 >= 12345.00) ? 12456 : 12456.02f;
		float var2 = var1 + 1024;
		System.out.println(var2);
		
		// Answer : C
	}
}
