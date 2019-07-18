package Q29;

public class DerivedB extends DerivedA{

	public void test() {
		System.out.println("DerivedB ");
	}
	
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Base
		 *    DerivedA
		 
		 * B. Base
		 *    DerivedB
		     
		 * C. DerivedB
		 *    DerivedB
		     
		 * D. DerivedB
		 *    DerivedA
		     
		 * E. A ClassCastException is thrown at runtime.
		 */
		
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();
		
		// Answer : C
		// 왜 그런지 모르겠음...
	}

}
