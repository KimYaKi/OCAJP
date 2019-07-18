
public class Q19 {
	public static void main(String[] args) {
		// What is the result?
		/**
		 * A. A B C Work done
		 * B. A B C D Work done
		 * C. A Work done
		 * D. Compilation fails.
		 */
		String[] arr = { "A", "B", "C", "D" };
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i].equals("C")) {
				continue;
			}
			System.out.println("Work done");
			break;
		}
		
		// Answer : C
		/**
		 * Reference
		 * for문 내의 조건문의 조건은 배열의 값이 'C'인 경우 continue문을 만나
		 * 그 시점에서 다시 반복이 시작되는 시점으로 돌아가도록 하는 것이다.
		 * 하지만, 배열의 처음 값이 'A'인 경우에는 조건을 만족하지 않으므로
		 * 아래 출력문이 작동하고 그 아래의 break;문이 작동하여 반복이 종료된다. 
		 */
	}
}
