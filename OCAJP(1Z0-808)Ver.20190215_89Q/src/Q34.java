
public class Q34 {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = new String("java");
		
		// Which code fragment, when inserted at line n1, enables the App class to print Equal?	
		/**
		 * A. String str3 = str2;
		      if (str1 == str3)
		      
		 * B. if (str1.equalseIgnoreCase(str2))
		 
		 * C. String str3 = str2;
		 
		 * D. if (str1.toLowerCase() == str2.toLowerCase())
		 
		 */
		
		/* line n1 */ if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		// Answer : B
	}

}
