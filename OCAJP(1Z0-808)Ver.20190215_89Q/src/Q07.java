
public class Q07 {

	public static void main(String[] args) {
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		// 변수에 값을 저장하지 않으므로 값은 그대로 유지된다.
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
	}

}
