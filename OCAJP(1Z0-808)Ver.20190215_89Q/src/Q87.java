
public class Q87 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Hello Log 1:0
		 * B. Hello Log 2:1
		 * C. Welcome Log 2:1
		 * D. Welcome Log 1:0
		 */
		
		int x = 1;
		int y = 0;
		if(x++ > ++y) {
			System.out.print("Hello ");
		}else {
			System.out.print("Welcome ");
		}
		System.out.println("Log " + x + " : " + y);
		
		// Answer : C
	}

}
