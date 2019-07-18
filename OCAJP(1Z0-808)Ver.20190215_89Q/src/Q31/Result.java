package Q31;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Result {
	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}
	}

	public static void main(String[] args) {
		List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));
		// Hank 출력

		// A : Error
		// checkAge(iList, () -> p.getAge() > 40);
		
		// B : Error
		// checkAge(iList, Person p -> p.getAge() > 40);
		
		// C : Answer
		checkAge(iList, p -> p.getAge() > 40);
		
		// D : Error
		// checkAge(iList, (Person p) -> {p.getAge() > 40;} );
	}
}
