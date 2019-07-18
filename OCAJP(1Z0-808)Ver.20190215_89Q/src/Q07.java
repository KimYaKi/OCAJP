
public class Q07 {

	public static void main(String[] args) {
		// What is the result?
		/**
		 * A. A B C D
		 * B. A C D
		 * C. A B C C
		 * D. A B D
		 * E. A B D C
		 */
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		// 변수에 값을 저장하지 않으므로 값은 그대로 유지된다.
		// C를 D로 변경하기 위한 것
		// ta = ta.replace('C', 'D');
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
		
		// Answer : C
	}

}
