
public class Q12 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException{	// line n1
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) {
		Q12 ex = new Q12();
		int cardNo = 12344;
		ex.checkCard(cardNo);							// line n2
		//ex.readCard(cardNo);							// line n3
		// What is the result?
		/**
		 * A. Reading Card
		 	  Checking Card
		 * 
		 * B. Compilation fails only at line n1.
		 * C. Compilation fails only at line n2.
		 * D. Compilation false only at line n3.
		 * E. Compilation false at both line n2 and line n3.
		 * 
		 * Answer : D
		 */
	}

}
