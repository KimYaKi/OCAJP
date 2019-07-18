package Q08;

public class Result {

	public static void main(String[] args) {
		// Which code fragment should you use at line n1 to instantiate the 'dvd' object successfully?
		/**
		 * A.	super.r = r;
		 		this.c = c;
		 	
		 * B.	super(r);
		 		this(c)
		 		
		 * C.	super(r);
		 		this.c = c;
		 		
		 * D.	this.c = r;
		 		super(c);
		 */
		DVD dvd = new DVD(10,20);
		System.out.println("r : " + dvd.r + ", c : "+dvd.c);
		
		// Answer : C
	}

}
