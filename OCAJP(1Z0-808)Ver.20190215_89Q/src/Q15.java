
public class Q15 {
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		// int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;	// compile Error
		int d = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println(d);
	}
}
