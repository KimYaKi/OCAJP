package Q41;

import java.util.ArrayList;

public class Result {

	public static void main(String[] args) {
		// A
		ArrayList<Animal> myList1 = new ArrayList<>();
		myList1.add(new Tiger());
		
		// B
		ArrayList<Hunter> myList2 = new ArrayList<>();
		myList2.add(new Cat());
		
		// C
		ArrayList<Hunter> myList3 = new ArrayList<>();
		myList3.add(new Tiger());
		
		/*
		// D : Compile Error
		ArrayList<Tiger> myList4 = new ArrayList<>();
		myList4.add(new Cat());
		*/
		
		// E
		ArrayList<Animal> myList5 = new ArrayList<>();
		myList5.add(new Cat());
	}

}
