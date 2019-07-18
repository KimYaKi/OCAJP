package Q56;

public class Test {

	public static void main(String[] args) {
		
		// Which is the result?
		/**
		 * A. Compilation fails in the Employee class.
		 * B. null : 0 : 0
		 * C. null : 0 : 0
		 * D. Compilation fails in the Test class.
		 * E. Both the Employee class and the Test class fails to compile.
		 */
		
		/* Employee e1 = new Employee(); */
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		
		/* e1.printDetails(); */
		e2.printDetails();
		e3.printDetails();
		
		// Answer : E
		/**
		 * Reference
		 * Employee클래스에 아무런 인자값이 없는 생성자를 만들거나,
		 * Test클래스에서 객체를 선언할 때 인자값을 입력하여 생성해야 한다.
		 */
	}

}
