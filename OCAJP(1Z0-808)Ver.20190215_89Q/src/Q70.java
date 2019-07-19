
public class Q70 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Compilation fails.
		 * B. 0 Found
		 * C. 1 Found
		 * D. 3 Found
		 */
		
		int data[] = { 2010, 2013, 2014, 2015, 2014 };
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e != key) {
				continue;
				//count++;
			}
		}
		System.out.println(count+" Found");
		
		// Answer : A
	}

}
