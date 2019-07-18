
public class Q46 {
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 1:2:3:4:5:
		 * B. 1:2:3:
		 * C. Compilation fails.
		 * D. An ArrayoutofBoundsException is thrown at runtime.
		 */
		
		int num1[] = new int[3];
		int num2[] = { 1, 2, 3, 4, 5 };
		num1 = num2;
		for(int x : num1) {
			System.out.print(x + ":");
		}
		
		// Answer : A
	}
}
