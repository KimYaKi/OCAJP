package Q55;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		// Which code fragment, when inserted at line 22, enables the code to print 'Mike Found'?
		/**
		 * A. int f = ps.indexOf(p2);
		 * B. int f = ps.indexOf(Patient("Mike"));
		 * C. int f = ps.indexOf(new Patient "Mike"));
		 * D. Patient p = new Patient("Mike");
		      int f = ps.indexOf(p);
		 */
		
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		
		/* insert code here */ int f = ps.indexOf(p2);
		
		if(f >= 0) {
			System.out.println("Mike Found");
		}
		
		// Answer : A 
	}
}
