package Q86;

public class Result {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Jiha");
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");
		
		for(Student s : students) {
			System.out.println(" " + s.name);
		}
	}
}
