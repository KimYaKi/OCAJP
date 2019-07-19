package Q86;

public class Result {
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. null
		      Richard
		      Donald
		      
		 * B. Richard
		      Donald
		      
		 * C. Compilation fails.
		  
		 * D. An ArrayIndexOutOfBoundsException is thrown at runtime.
		 
		 * E. A NullPointerException is thrown at runtime.
		 
		 */
		
		Student[] students = new Student[3];
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");
		
		for(Student s : students) {
			System.out.println(" " + s.name);
		}
		
		// Answer : E
	}
}
