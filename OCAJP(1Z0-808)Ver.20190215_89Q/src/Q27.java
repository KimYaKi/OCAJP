
public class Q27 {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		// How to Printing XXXX-XXXX-XXXX-1121?

		/*
		 * // Option A :
		 * StringBuilder sb = new StringBuilder(creditCard);
		 * sb.substring(15, 19); 
		 * return x+sb;
		 */

		/*
		 * // Option B :
		 * return x + creditCard.substring(15, 19);
		 */


		 // Option C :
		 StringBuilder sb = new StringBuilder(x);
		 sb.append(creditCard, 15, 19); 
		 return sb.toString();

		
		/*
		 * // Option D :
		 * StringBuilder sb = new StringBuilder(creditCard); StringBuilder s =
		 * sb.insert(0, x); 
		 * return s.toString();
		 */
	}

	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
		
		// Answer : B, C
	}
}
