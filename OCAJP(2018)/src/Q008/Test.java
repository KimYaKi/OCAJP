package Q008;

class X{
	public void printFileContent() {
		/* code goes here */
		throw new IOException();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X xobj = new X();
		xobj.printFileContent();
	}
}
