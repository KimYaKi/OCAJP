
public class Q45 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. true false
		 * B. true null
		 * C. Compilation fails
		 * D. A NullPointerException is thrown at runtime
		 */
		
		Boolean[] bool = new Boolean[2];

		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);

		System.out.println(bool[0] + " " + bool[1]);

		// Answer : A
	}

}
