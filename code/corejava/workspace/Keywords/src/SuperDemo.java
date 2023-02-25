public class SuperDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Abc";
		emp.contact="9098987678";
		emp.salary=34534.43;
		emp.printDetails();
	}
}

class Person {
	String name;
	String contact;
	int x = 20;
	public Person() {
		System.out.println("Person class");
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
	}
}

// Employee IS-A Person
class Employee extends Person {
	double salary;
	int x = 50;
	public Employee() {
		super(); // access the super class constructor 
		System.out.println("Employee Class");
	}
	public void display() {
		System.out.println("Salary : " + salary);
	}
	public void printDetails() {
		super.display(); // Access the super class method
		display();
		System.out.println(super.x); // Access the super class variable
	}
}