
public class Q37 {
	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		//iVar = fVar;
		fVar = iVar;
		dVar = iVar;
		//fVar = dVar;
		dVar = iVar;
		//iVar = dVar;
		
		// Which three lines fail to compile?
		/**
		 * A. Line 7
		 * B. Line 8
		 * C. Line 9
		 * D. Line 10
		 * E. Line 11
		 * F. Line 12
		 */
		
		// Answer : A, D, F
	}
}
