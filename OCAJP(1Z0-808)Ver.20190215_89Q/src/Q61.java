
public class Q61 {
	static int count;
	public static void displayMsg() {
		count++;
		System.out.println("Welcome "+"Visit Count: "+count);
	}
	public static void main(String[] args) {
		Q61.displayMsg();
		Q61.displayMsg();
	}
}
