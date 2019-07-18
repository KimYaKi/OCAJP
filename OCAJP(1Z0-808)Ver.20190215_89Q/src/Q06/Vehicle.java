package Q06;

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;
	
	Vehicle(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

// Given the code:
/**
	Car c1 = new Car("Auto");
	Car c2 = new Car("4W", 150, "Manual");
	System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
	System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

 * What is the result?
 * A.	4W 100 Auto
		4W 150 Manual
 * B.	Null 0 Auto
 		Null 0 Auto
 * C.	Compilation fails only at line n1.
 * D.	Compilation fails only at line n2.
 * E.	Compilation fails at both line n1 and line n2.
 * 
 * Answer : C
 */