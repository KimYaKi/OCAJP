
public class Q53 {

	public static void main(String[] args) {
		
		// What is the result if the integer aVar is 9?
		/**
		 * A. Compilation fails.
		 * B. 10 Hello Universe!
		 * C. 10 Hello World!
		 * D. 9 Hello World!
		 */
		
		int aVar = 9;
		
		if(aVar++ < 10) {
			System.out.println(aVar + " Hello World!");
		}else {
			System.out.println(aVar + " Hello Universe!");
		}
		
		// Answer : C
	}

}
