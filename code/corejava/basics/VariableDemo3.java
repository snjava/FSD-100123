public class VariableDemo3
{
	int x;   // Instance varaible
	static int y; // Static/Class varaible
	boolean flag;
	public void test() {
		int z = 30 ;  // Local varaible
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public void print() {
		System.out.println(x);
		System.out.println(y);
	}
}