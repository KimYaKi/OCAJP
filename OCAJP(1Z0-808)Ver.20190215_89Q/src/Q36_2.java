
public class Q36_2 {
	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new Q36_1("Java SE 8"));
		
		// What is the result?
		/**
		 * A. Hello Java SE 8
		      Hello Java SE 8
		      
		 * B. Hello java.lang.StringBuilder@<<hashcode1>>
		      Hello Q36_1@<<hashcode2>>
		      
		 * C. Hello Java SE 8
		      Hello Q36_1@<<hashcode>>
		    
		 * D. Compilation fails at the Q36_2 class
		 */
		
		// Answer : C
	}
}