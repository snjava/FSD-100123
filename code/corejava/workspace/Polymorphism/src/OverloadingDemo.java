public class OverloadingDemo {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add("Abc"," Xyz");
	}
	
	public static void main(int args) {
		
	}
}
class Calculation {
	final public void add(int a, int b) {
		int ans = a + b;
		System.out.println("2 int number addition : " + ans);
	}
	
	protected double add(double a , double b) {
		double ans = a + b;
		System.out.println("2 double number addition : " + ans);
		return ans;
	}
	
	 void add(String a, String b) {
		String ans = a + b;
		System.out.println("2 String addition : " + ans);
	}
}
