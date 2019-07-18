package Q41;
import java.util.ArrayList;

public class Tiger extends Cat{
	public static void main(String[] args) {
		/* A : */
		ArrayList<Animal> myList = new ArrayList<>();
		myList.add(new Tiger());
		
		
		/*  B : */
		ArrayList<Hunter> myList1 = new ArrayList<>();
		myList1.add(new Cat());
		
		
		/* C : */
		ArrayList<Hunter> myList2 = new ArrayList<>();
		myList2.add(new Tiger());
		
		
		/* D : Error */
		//ArrayList<Tiger> myList3 = new ArrayList<>();
		//myList3.add(new Cat());
		
		
		/* E : */
		ArrayList<Animal> myList4 = new ArrayList<>();
		myList4.add(new Cat());
	}
}