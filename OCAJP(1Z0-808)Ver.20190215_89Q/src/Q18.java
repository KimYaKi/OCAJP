
public class Q18 {

	public static void main(String[] args) {
		
		// Which code fragment, when inserted at line 15, enables the code to print 10:20?
		/**
		 * A. int[] array = new int[2];
		 * B. int[] array;
		 *    array = int[2];
		 * C. int array = new int[2];
		 * D. int array[2];
		 */
		
		/* insert code here */ int[] array = new int[2];
		
		array[0] = 10;
		array[1] = 20;
		System.out.println(array[0]+":"+array[1]);
		
		// Answer : A
	}

}
