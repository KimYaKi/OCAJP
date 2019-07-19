
public class Q72 {
	public static final int MIN = 1;
	public static void main(String[] args) {
		
		int x = args.length;
		if(checkLimit(x)) { // line n1
			System.out.println("Java SE");
		}else {
			System.out.println("Java EE");
		}
		
		/**
		 * And given the commands:
		  
		   javac Q72.java
		   java Q72
		  
		 * What is the result?
		 *
		 * A. Java SE
		 * B. Java EE
		 * C. Compilation fails at line n1.
		 * D. A NullPointerException is thrown at runtime.
		 */
		
		// Answer : B
		// output : Java EE
	}
	public static boolean checkLimit(int x) {
		return (x >= MIN) ? true : false;
	}
}
