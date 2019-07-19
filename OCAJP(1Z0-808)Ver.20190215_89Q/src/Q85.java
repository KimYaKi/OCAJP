import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q85 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Compile fails.
		 * B. Hi removed
		 * C. An UnsupportedOperationException is thrown at runtime.
		 * D. The program compiles, but it prints nothing.
		 */
		
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s) -> (return s.length() <= 2;))) {
			System.out.println(s + "removed");
		}

		// Answer : A
	}

}
