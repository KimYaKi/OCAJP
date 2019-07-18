
public class Q47 {

	int id;
	String name;
	public Q47(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Q47 p1 = new Q47(101, "Pen");
		Q47 p2 = new Q47(101, "Pen");
		Q47 p3 = p1;
		boolean ans1 = p1 == p2; // false
		boolean ans2 = p1.name.equals(p2.name); // true
		
		System.out.println(ans1 + ":" + ans2);
	}

}
