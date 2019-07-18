
public class Q40 {
	public static void main(String[] args) {
		int[] intArr = {15,30,45,60,75};
		
		intArr[2] = intArr[4];
		// 45를 75로 변경
		
		intArr[4] = 90;
		// 75를 90으로 변경
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
			if(i != 4) {
				System.out.print(",");
			}
		}
		
		// What are the values of each element in intArr after this code has executed?
		/**
		 * A. 15, 60, 45, 90, 75
		 * B. 15, 90, 45, 90, 75
		 * C. 15, 30, 75, 60, 90
		 * D. 15, 30, 90, 60, 90
		 * E. 15, 4, 45, 60, 90
		 */
		// Answer : C
	}
}
