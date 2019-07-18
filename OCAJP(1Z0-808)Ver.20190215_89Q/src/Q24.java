
public class Q24 {
	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);

		/*
		 * If the value of the 'qty' variable is greater than or equal to 90, 'discount' = 0.5
		 * If the value of the 'qty' variable is between 80 and 90, 'discount' = 0.2
		 * */
		
		// Option A
		if (qty >= 90) { discount = 0.5; } 
		else if (qty >= 80 && qty < 90) { discount = 0.2; }
		
		/**
		 * Option B
		 * discount = (qty >= 90) ? 0.5 : 0;
		 * discount = (aty > 80) ? 0.2 : 0;
		 */
		
		// Option C
		discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		
		/**
		 * Option D
		 * if (qty > 80 && qty < 90) { discount = 0.2; }
		 * else { discount = 0; }
		 * 
		 * Option E
		 * discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
		 */
		
		// Answer : A, C

	}
}
