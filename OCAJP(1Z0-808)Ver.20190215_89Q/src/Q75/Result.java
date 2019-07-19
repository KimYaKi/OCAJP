package Q75;

public class Result {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 300:300
		      200:300
		      
		 * B. 300:100
		      200:300
		      
		 * C. 300:0
		      0:300
		      
		 * D. 200:300
		      200:300
		 */
		
		Test t1 = new Test();
		t1.var = 300;
		System.out.println(t1);
		Test t2 = new Test();
		t2.stVar = 300;
		System.out.println(t2);
		
		// Answer : B
	}

}
