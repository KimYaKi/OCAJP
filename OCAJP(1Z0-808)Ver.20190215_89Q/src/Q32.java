
public class Q32 {
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. A B C
		 * B. A B C D E
		 * C. A B D E
		 * D. Compilation fails.
		 */
		
		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
		
		for(int i = 0; i  < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				// 현재 배열 위치의 값이 'B'이면 현재 for문은 break;
				if(arr[i][j].equals("B")) {
					break;
				}
			}
			// 배열의 다음 행으로 넘어감
			continue;
		}
		
		// Answer : C
	}
}
