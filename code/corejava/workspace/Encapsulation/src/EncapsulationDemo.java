public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(121);
		emp.setName("Abc");
		emp.setSalary(12344.23);
		
		emp.display();
		
	}
}

class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public void setId(int i) {
		empId = i;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSalary(double s) {
		if(s>=10000) {
			salary = s;
		} else {
			System.out.println("Invalid Salary.....");
			System.exit(0);
		}
	}
	
	public int getId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	
	
	public void display() 
	{
		System.out.println("Id : " + empId);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
}
