import java.util.ArrayList;
import java.util.List;

public class Q81 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. [green, red, yellow, cyan]
		 * B. [green, blue, yellow, cyan]
		 * C. [green, red, cyan, yellow]
		 * D. An IndexOutOfBoundsException is thrown at runtime.
		 */
		
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3, "cyan");
		System.out.println(colors);
		
		// Answer : A
	}

}
