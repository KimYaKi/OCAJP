
public class Q13 {
	
	public static void main(String[] args) {
		
		//boolean opt = true;
		// opt를 사용하여 TrueDone를 출력할 수 있는 방법 선언
		String opt = "true";
		
		switch(opt) {
		case "true":
			System.out.print("True");
			break;
		default:
			System.out.print("****");
		}
		System.out.println("Done");
	}
}
