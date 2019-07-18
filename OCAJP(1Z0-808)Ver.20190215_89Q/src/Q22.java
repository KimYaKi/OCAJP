
public class Q22 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		
		// How print True?
		
		// Option A : 
		String str2 = str1;
		// Option B : String str2 = new String(str1);
		// Option C : String str2 = sb1.toString();
		// String D : String str2 = "Duke";
		
		// '=='연산자는 주소가 동일함을 보기 때문에 Option A로 선언하는 것이 바람직함
		System.out.println(str1 == str2);
	}

}
