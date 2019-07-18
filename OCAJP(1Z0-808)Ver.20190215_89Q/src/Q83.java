
public class Q83 {
	int x, y;
	
	public Q83(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		Q83 obj = new Q83(x, y);
		// 단순 x, y는 지역변수이기 때문에 obj.x, obj.y를 써야 제곱된 결과를 출력할 수 있음
		System.out.println(x + " " + y);
	}
}
