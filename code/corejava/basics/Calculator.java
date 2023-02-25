public class Calculator {

	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.add();

		cal.sub(20, 5);

		double res1 = cal.div();
		System.out.println(res1);

		int res2 = cal.mul(12, 5);
		System.out.println(res2);
	} 

	public void add() {
		int a= 20;
		int b = 10;
		int ans = a + b;
		System.out.println(ans); 
	}

	// Create a method which accept the 2 int values and print their substraction.
	public void sub(int a, int b) {
		int ans = a - b;
		System.out.println(ans);
	}

	// Create a method which do not accept any value but it return the division of 20 and 5
	public double div() {
		double a = 20;
		double b = 5;
		double ans = a / b;
		return ans;
	}
	
	// Create a method which accept values and return the multiplication of the values
	public int mul(int a, int b) {
		int ans = a * b;
		return ans;
	}
}






