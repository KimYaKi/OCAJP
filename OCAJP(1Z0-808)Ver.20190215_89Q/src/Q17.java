
public class Q17 {

	static int i;
	int j;

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. 3 4 5 6
		 * B. 3 4 3 6
		 * C. 5 4 5 6
		 * D. 3 6 4 6
		 */
		
		Q17 x1 = new Q17();
		Q17 x2 = new Q17();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
		
		// Answer : C
		// 이건 진짜 이유를 모르겠음;;
	}

}
