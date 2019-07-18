package Q67;

public class Q67 {

	public static void main(String[] args) {
		int[] stack = {10,20,30};
		int size = 3;
		int idx = 0;
		
		do {
			idx++;
		}while(idx >= size);
		
		System.out.println("The Top element : " + stack[idx]);
	}

}
