package Q004;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;			// line 1
		String s4 = (String) (s3 * s2);		// line 2
		System.out.println("Sum is " + s4);
	}

}
