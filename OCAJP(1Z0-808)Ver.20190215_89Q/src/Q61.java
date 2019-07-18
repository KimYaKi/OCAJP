
public class Q61 {
	int count;
	public static void displayMsg() {
		//count++;	// line n1
		//System.out.println("Welcome "+"Visit Count: "+count);	// line n2
	}
	public static void main(String[] args) {
		Q61.displayMsg();	// line n3
		Q61.displayMsg();	// line n4
		
		// What is the result?
		/**
		 * A. Compilation fails at line n3 and line n4.
		 * B. Compilation fails at line n1 and line n2.
		 * C. Welcome Visit Count: 1
		      Welcome Visit Count: 1
		      
		 * D. Welcome Visit Count: 1
		      Welcome Visit Count: 2
		 */
		
		// Answer : B
		/**
		 * Reference
		 * 전역 변수를 메소드 안에서 사용하기 위해서는 정적(static)선언이 필요하다.
		 */
	}
}
