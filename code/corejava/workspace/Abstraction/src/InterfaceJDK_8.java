
public class InterfaceJDK_8 {
	public static void main(String[] args) {
		
	}
}

interface InterDemo1 {
	void m1();
	
	default void m2() {
		System.out.println("This is Default method inside interface");
	}
	
	static void m3() {
		System.out.println("This is static method inside interface");
	}
}

@FunctionalInterface
interface InterDemo2 {
	void m1();
	default void m2() {
		
	}
}














