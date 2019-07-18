package Q48;

public class Result {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		
		employee.salary = 50000;
		director.salary = 80000;
		//employee.budget = 200000;
		manager.budget = 1000000;
		//manager.stockOptions = 500;
		director.stockOptions = 1000;
	}
}
