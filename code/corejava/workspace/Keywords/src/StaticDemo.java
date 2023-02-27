
public class StaticDemo {
	public static void main(String[] args) {
		System.out.println(Employee1.company);
		Employee1.m2();
	}
}
class Employee1 {
	static String company = "Abc Pvt.Ltd";
	int id=20;
	
	public void m1() {
		System.out.println("Non Static method...");
	}
	
	public static void m2() {
		System.out.println("Static method...");
		System.out.println(company);
	}
}
