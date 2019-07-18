package Q28;

import p1.Acc;
public class Test extends Acc{
	public static void main(String[] args) {
		
		Acc obj = new Test();
		
		
		// Which statement is true?
		/**
		 * A. Both p and s are accessible by obj.
		  	-> p와 s 모두 obj로 액세스 할 수 있다.
		 * B. Only s is accessible by obj.
		  	-> obj는 s에만 접근할 수 있다.
		 * C. Both r and s are accessible by obj.
		  	-> r과 s 모두 obj로 액세스 할 수 있다.
		 * D. p, r, and s are accessible by obj.
		  	-> p, r 및 s는 obj로 액세스 할 수 있다.
		 */
		
		// Answer : B
		/**
		 * Reference
		 * 접근 제한자 없이 선언 한 경우 : private이 default
		 * private : 현재 객체 내에서만 사용 가능
		 * protected : 같은 패키지(폴더)에 있는 객체와 상속이 된 객체들만 사용 허용
		 * public : 모든 객체 접근 가능
		 */
	}
}
