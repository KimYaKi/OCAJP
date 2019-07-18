
// Which two modifications, made independently, enable the code to compile? (Choose 2)
/**
 * A. Make the method at line n1 public.
 * B. Make the method at line n2 public.
 * C. Make the method at line n3 public.
 * D. Make the method at line n3 protected.
 * E. Make the method at line n4 public.
 */
abstract class Planet{
	protected void revolve() {	// line n1
		
	}
	abstract void rotate();		// line n2
}

public class Q05 extends Planet{
	/*
	// protected or public need
	void revolve() {			// line n3
		
	}
	*/
	// Make the method at line n3 public.
	// Make the method at line n3 protected.
	
	protected void rotate() {	// line n4
		
	}
	
	// Answer : C, D
}
