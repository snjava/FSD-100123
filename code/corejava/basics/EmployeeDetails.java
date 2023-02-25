public class EmployeeDetails
{
	public static void main(String arr[]) {
		Employee emp1 = new Employee();
		emp1.id =121;
		emp1.salary=23341.23;
		emp1.printDetails();

		Employee emp2 = new Employee();
		emp2.printDetails();
	}
}

class Employee {
	int id;
	double salary;
	public void printDetails() {
		int id = 22;
		System.out.println("Id :  " + id);
		System.out.println("Salary :  " + salary);
	}
} 