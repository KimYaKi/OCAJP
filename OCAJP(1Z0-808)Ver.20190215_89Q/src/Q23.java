
public class Q23 {
	public static void main(String[] args) {
		Q23 ts = new Q23();
		System.out.print(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;
}
