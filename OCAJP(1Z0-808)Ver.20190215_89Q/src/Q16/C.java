package Q16;

class C extends B{
	
	public C() {					// line n2
		System.out.print("C ");
	}
	
	public static void main(String[] args) {
		// What is the result?
		/**
		 * A. C B A
		 * B. C
		 * C. A B C
		 * D. Compilation fails at line n1 and line n2.
		 */
		C c = new C();
		
		// Answer : C
		/**
		 * Reference
		 * 본인을 객체로 선언하여 출력하는 경우
		 * 상속받은 상위 클래스를 먼저 컴파일 한다.
		 * 상위 클래스 모두 생성자 내에서 자신의 클래스 명을 출력하기 때문에
		 * 상위 클래스 순서대로 출력된다.
		 */
		
	}
}
