
public class Q84 {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int x = array.length;

		// A : 
		while (x > 0) {
			x--;
			System.out.println(array[x]);
		}
		System.out.println("----");

		x = array.length;
		// E :
		while (x > 0) {
			System.out.println(array[--x]);
		}
	}
}
