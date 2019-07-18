package Q06;

class Car extends Vehicle{
	String trans;
	
	/*
	Car(String trans){	// line n1
		this.trans = trans;
	}
	*/
	
	Car(String type, int maxSpeed, String trans){
		super(type, maxSpeed);
	//	this(trans);	// line n2
	}
	
	// Compilation fails at both line n1 and line n2
}
