
public class Q14 {

	public static void main(String[] args) {
		// What is the result?
		/**
		 * A. 5 4 3 2 1 0
		 * B. 5 4 3 2 1
		 * C. 4 2 1
		 * D. 5
		 * E. Nothing is printed.
		 */
		int num = 5;
		do {
			System.out.print(num-- + " ");
		}while(num == 0);
		// Answer : D
		
		/**
		 * Reference
		 * do-while문은 먼저 한 번 출력을 한 뒤에 조건을 판단 하여
		 * 해당 조건이 true일 경우 반복을 수행한다.
		 * 판단하는 조건식이 'num == 0' 즉, num의 값이 0인경우 반복을 한다는 의미이다.
		 * 더불어 출력하는 시점에서 'num--'를 하기 때문에 처음 출력한 당시 값은
		 * 5로 유지되어 출력된다.
		 */
	}

}
