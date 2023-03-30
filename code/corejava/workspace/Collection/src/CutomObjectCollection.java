import java.util.ArrayList;

public class CutomObjectCollection {
	public static void main(String[] args) {
		Employee e1 = new Employee(121, "A", "a@gmail.com");
		Employee e2 = new Employee(11, "B", "b@gmail.com");
		Employee e3 = new Employee(21, "C", "c@gmail.com");
		Employee e4 = new Employee(12, "D", "d@gmail.com");
		Employee e5 = new Employee(1, "E", "e@gmail.com");
		Employee e6 = new Employee(2, "F", "f@gmail.com");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		for(Employee e : list) {
			System.out.print(e.getId() + "\t");
			System.out.print(e.getName() + "\t");
			System.out.print(e.getEmail() + "\n");
		}
		
	}
}
