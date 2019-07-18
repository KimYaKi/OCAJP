
public class Q62 {
	static int count = 0;
	int i = 0;
	public void changeCount() {
		while(i < 5) {
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 5:5
		 * B. 10:10
		 * C. 5:10
		 * D. Compilation fails.
		 */
		
		Q62 check1 = new Q62();
		Q62 check2 = new Q62();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count);
		
		// Answer : B
	}
}
