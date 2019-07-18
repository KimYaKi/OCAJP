
public class Q38 {

	public static void main(String[] args) {
		int num[][] = new int[1][3];
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"] = 10");
				num[i][j] = 10;
			}
		}
	}

}
