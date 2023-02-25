
public class Multilevel {
	public static void main(String[] args) {
		B obj = new C(); // polymorphic object
		A obj1 = new C();
		
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
	}
}

class A extends Object {
	int x = 10;
}

class B extends A {
	int y = 20;
}

class C extends B {
	int z = 30;
}






