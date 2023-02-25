public class VariableDemo3
{
	int x= 10;   // Instance varaible
	static int y = 20; // Static/Class varaible
	public void test() {
		int z = 30;  // Local varaible
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public void print() {
		System.out.println(x);
		System.out.println(y);
	}
}