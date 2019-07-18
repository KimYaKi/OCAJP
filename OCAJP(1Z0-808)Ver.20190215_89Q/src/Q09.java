
public class Q09 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// print 135
		
		// Question : for(xxx)
		
		// Option A : int e = 0; e <= 4; e++
		
		// Option B
		for(int e = 0; e < 5; e +=2) {
			System.out.print(a[e]);
		}
		
		// Option C : int e = 1; e <= 5; e += 1
		// Option D : int e = 1; e < 5; e += 2
	}

}
