
public class InterfaceDemo2 {
	public static void main(String[] args) {
	}
}

interface Inter1 {
	int a = 10;
	public void m1();
}

interface Inter2 {
	int b = 20;
	public void m2();
}

// One interface can extends more than one interface.
interface Inter3 extends Inter1, Inter2 {
	int c = 10;
	public void m3();
}

abstract class Demo implements Inter1 ,Inter2 {
	
}

abstract class Test extends Demo implements Inter1, Inter2, Inter3 {
	
}




